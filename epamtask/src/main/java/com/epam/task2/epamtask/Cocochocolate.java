package com.epam.task2.epamtask;

class Cocochocolate extends Chocolate implements Gift{
    Cocochocolate(int quantity,int calories,int wei){
    super(quantity,calories,wei);
    }
    public void name(){
        System.out.println("Cocochocolate");
    }
    public int getquantity(){
    	return quantity;
    }
    public String getname(){
        return "Cocochocolate";
   }
    public int getweight(){
    	return wei;
    }
}
