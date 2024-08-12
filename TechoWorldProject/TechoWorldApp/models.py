from django.db import models
from datetime import datetime
# Create your models here.
from django.db import models

class user(models.Model):
  username = models.CharField(max_length=150)
  email = models.EmailField(max_length=254)
  password = models.CharField(max_length=128) 
  first_name = models.CharField(max_length=150) 
  last_name = models.CharField(max_length=150) 
  is_active = models.BooleanField(default=True)
  
class post(models.Model):
    title = models.CharField(max_length=200)
    
