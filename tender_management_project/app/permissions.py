from rest_framework.permissions import  IsAuthenticated , BasePermission , SAFE_METHODS 

class BidderAccess(IsAuthenticated):
    def has_permission(self, request, view ):
        # print(obj.bidderId)
        print(request.user.role.rolename)
        if request.method is SAFE_METHODS:
            return 
        return request.user.role.rolename=="BIDDER"
        


class ApproverAccess(BasePermission):
    def has_permission(self, request, view ):
        # print(obj.bidderId.role)
        # print(obj)
        print(request.user.role.rolename)
        if request.method in SAFE_METHODS:
            return True
        # print(request.user.role.rolename=="APPROVER")
        return request.user.role.rolename=="APPROVER"
        

class DeletingAccess(BasePermission):
    def has_object_permission(self, request, view, obj):
        if request.method in SAFE_METHODS:
            return True 
        return request.user == obj.bidderId
# class ApproverAndBidderAccess(IsAuthenticated):
    

 