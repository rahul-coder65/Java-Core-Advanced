from rest_framework import serializers 
from .models import CustomUser , Role , Bidding
from datetime import datetime 

class RoleSerializer(serializers.ModelSerializer):
    class Meta:
        model = Role 
        fields="__all__"

class UserSerializer(serializers.ModelSerializer):
    class Meta:
        model = CustomUser 
        fields= ['id',"username", "email" , "password" , "companyName" ,"role"]
        # fields="__all__"
        extra_kwargs = {
            'id' : {'read_only' : True}
        }
        
        
        

    def create(self, validated_data):
        user = CustomUser.objects.create_user(
            username=validated_data['username'],
            email=validated_data['email'],
            companyName=validated_data['companyName'] ,
            role=validated_data['role'],
            password=validated_data['password']
        )
        # user.set_password(validated_data['password']) 
        return user 

class BiddingSerializer(serializers.ModelSerializer):
    class Meta:
        model = Bidding 
        fields = ['id','biddingId', 'bidAmount', 'yearToComplete','projectName','dateOfBidding' ,'status' , 'bidderId' ]
        extra_kwargs = {
            'id' : {'read_only' : True},
            'projectName' : {'read_only' : True},
            'dateOfBidding' : {'read_only' : True},
            'bidderId' : {'read_only' : True}
        }
    # def create(self, validated_data):
    #     created_at = datetime.now().strftime("%d/%m/%y") 
    #     bidding = Bidding.objects.create(
    #         biddingId=validated_data['biddingId'] ,
    #         bidAmount=validated_data['bidAmount'],
    #         yearToComplete=validated_data['yearToComplete'] ,
    #         dateOfBidding=created_at
    #     )
    #     bidding.save() 
    #     return bidding 
class LoginSerializer(serializers.Serializer):
    email=serializers.EmailField(required=True)
    password=serializers.CharField(required=True)
