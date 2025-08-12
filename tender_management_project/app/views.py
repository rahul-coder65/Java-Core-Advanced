from django.shortcuts import render
from rest_framework.views import APIView 
from rest_framework import generics 
from rest_framework.response import Response 
from django.contrib.auth import authenticate 
from .models import CustomUser, Bidding , Role 
from .serializers import RoleSerializer, UserSerializer , BiddingSerializer , LoginSerializer
from rest_framework_simplejwt.tokens import RefreshToken , AccessToken 
from .permissions import BidderAccess ,ApproverAccess
from datetime import datetime
from rest_framework.permissions import IsAdminUser
from rest_framework.permissions import IsAuthenticated
# Create your views here.
class RoleCreate(generics.ListCreateAPIView):
    queryset= Role.objects.all() 
    serializer_class = RoleSerializer

class AddUserView(generics.ListCreateAPIView):
    queryset = CustomUser.objects.all() 
    serializer_class = UserSerializer

class BiddingAdd(generics.CreateAPIView):
    # queryset=Bidding.objects.all() 
    serializer_class=BiddingSerializer
    permission_classes = [BidderAccess | ApproverAccess]
    def get_queryset(self):
        print(self.request.user.role)
        return Bidding.objects.all()
    def perform_create(self, serializer):
        print(self.request.user.role)
        created_at = datetime.now().strftime("%d/%m/%y") 
        serializer.save(
            biddingId=serializer.validated_data['biddingId'] ,
            bidAmount=serializer.validated_data['bidAmount'],
            yearToComplete=serializer.validated_data['yearToComplete'] ,
            dateOfBidding=created_at,
            bidderId=self.request.user
         )
        
class BiddingList(generics.ListAPIView):
    serializer_class = BiddingSerializer 
    permission_classes = [IsAuthenticated] 
    def get_queryset(self):
        print(self.request.user.role)
        bidAmount = self.request.query_params.get("bidAmount", 0.0)
        return Bidding.objects.filter(bidAmount__gte=bidAmount)

class BiddingUpdate(APIView): 
    permission_classes = [ApproverAccess]
    # def get_queryset(self):
    #     print(self.request.user.role)
        # return Bidding.objects.all() 
    def patch(self, request , pk):
        print(request.user.role.rolename)
        bid = Bidding.objects.get(pk=pk)
        serializer = BiddingSerializer(bid,data=request.data,  partial=True)
        if serializer.is_valid():
            serializer.save() 
            print(serializer.data)
            return Response(serializer.data)
        else:
            return Response(serializer.errors, status=400)

class BiddingDelete(generics.DestroyAPIView):
    queryset= Bidding.objects.all() 
    serializer_class = BiddingSerializer 
    permission_classes=[IsAuthenticated]

class LoginView(APIView):
    def post(self, request):
        serializer = LoginSerializer(data=request.data)
        if serializer.is_valid():
            email = serializer.validated_data['email']
            password=serializer.validated_data['password']
            user = CustomUser.objects.get(email=email)
            # user2 = CustomUser.objects.filter(email=email, password=password)[0]
            auth_user = authenticate(request, username=user.username, password=password)
            # print(user) 
            if auth_user is not None:
                jwt = AccessToken.for_user(user=auth_user) 
                data = {
                    "jwt" : str(jwt),
                    "status" : 200
                }
                return Response(data) 
            else:
                return Response("invalid credentials" , status=400) 
        else:
            return Reponse(serializer.errors, status=400)


class Home(APIView):
    def get(self , request):
        print(request.user.role) 
        return Response("Hello")




{
    "task_prompt": "\nAcknowledge the user about his current choice of plan and guide the user regarding the purchase process. \n",
    "system_prompt_config": {
        "url": "http://localhost:8091/sse",
        "prompt": "persona_prompt",
        "arguments": {
            "persona": "execution"
        }
    },
    "tools_config": {},    
    "llm_config": {
        "provider": "ollama",
        "arguments": {
            "model": "llama3.2"
        }
    }
}
