package com.epam.task2.epamtask;

class Candy extends Chocolate implements Gift{
    Candy(int quantity,int calories,int wei){
    super(quantity,calories,wei);
    }
    public void name(){
        System.out.println("Candy");
    }
    public int getquantity(){
    	return quantity;
    }
    public String getname(){
         return "Candy";
    }
    public int getweight(){
    	return wei;
    }
}
