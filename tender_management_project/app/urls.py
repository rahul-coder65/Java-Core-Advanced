from django.urls import path 
from app import views 

urlpatterns = [
    path('role/add/', views.RoleCreate.as_view(), name='role-add'),
    path('user/add/', views.AddUserView.as_view(), name='user-add'),
    path('bidding/list/', views.BiddingList.as_view(),name='bidding-list'),
    path('login/', views.LoginView.as_view(),name='login'),
    path('hello/', views.Home.as_view()),
    path('bidding/add/', views.BiddingAdd.as_view()),
    path('bidding/list/', views.BiddingList.as_view()),
    path('bidding/update/<int:pk>/', views.BiddingUpdate.as_view()),
    path('bidding/delete/<int:pk>/', views.BiddingDelete.as_view()),
]