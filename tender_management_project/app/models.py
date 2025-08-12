from django.db import models
from django.contrib.auth.models import AbstractUser

# Create your models here.
class Role(models.Model):
    rolename=models.CharField(max_length=100, unique=True)

    def __str__(self):
        return self.rolename 

class CustomUser(AbstractUser):
    email=models.EmailField(unique=True)
    companyName=models.CharField(max_length=50) 
    role=models.ForeignKey(Role, on_delete=models.CASCADE)
    

    # def __str__(self):
    #     return self.

class Bidding(models.Model):
    biddingId = models.IntegerField(unique=True) 
    projectName=models.CharField(max_length=100, default="Metro Phase V 2024") 
    bidAmount=models.FloatField() 
    yearToComplete=models.FloatField() 
    dateOfBidding=models.CharField(max_length=10) 
    status=models.CharField(max_length=50, default="pending") 
    bidderId=models.ForeignKey(CustomUser,on_delete=models.CASCADE) 

    def __str__(self):
        return self.projectName 






