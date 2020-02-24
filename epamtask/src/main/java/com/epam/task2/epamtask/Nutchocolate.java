package com.epam.task2.epamtask;

class Nutchocolate extends Chocolate implements Gift{
    Nutchocolate(int quantity,int calories,int wei){
    super(quantity,calories,wei);
}
    public void name(){
        System.out.println("Nutchocolate");
    }
    public int getquantity(){
    	return quantity;
    }
    public String getname(){
        return "NutChocolate";
   }
    public int getweight(){
    	return wei;
    }
}