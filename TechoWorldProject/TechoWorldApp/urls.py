from django.urls import path
from . import views

urlpatterns = [
    path('', views.TechoWorldApp, name='TechoWorld'),
]