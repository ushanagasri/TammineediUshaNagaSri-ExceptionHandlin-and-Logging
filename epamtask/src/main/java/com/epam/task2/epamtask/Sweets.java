package com.epam.task2.epamtask;

abstract class Sweets{
	   public int quantity;
	   public int calories;
	   public int wei;
	   abstract int getquantity();
	   abstract int getweight();
	   abstract String getname();
	  Sweets(int quantity,int calories,int wei){
	       this.quantity=quantity;
	       this.calories=calories;
	       this.wei=wei;
	   }
	   //abstract name();
	}