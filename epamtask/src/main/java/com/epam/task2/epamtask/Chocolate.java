package com.epam.task2.epamtask;

abstract class Chocolate{
	   public int quantity;
	   public int calories;
	   public int wei;
	   abstract int getquantity();
	   abstract int getweight();
	   abstract String getname();
	   Chocolate(int quantity,int calories,int wei){
	       this.quantity=quantity;
	       this.calories=calories;
	       this.wei=wei;
	   }
	  
	}