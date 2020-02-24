package com.epam.task2.epamtask;

class Waferchocolate extends Chocolate implements Gift{
    Waferchocolate(int quantity,int calories,int wei){
    super(quantity,calories,wei);
    }
    public void name(){
        System.out.println("Waferchocolate");
    }
    public int getquantity(){
    	return quantity;
    }
    public String getname(){
        return "Waferchocolate";
   }
    public int getweight(){
    	return wei;
    }
}
