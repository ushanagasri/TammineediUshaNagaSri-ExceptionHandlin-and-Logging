package com.epam.task2.epamtask;

class Rasagulla extends Sweets implements Gift{
    Rasagulla(int quantity,int calories,int wei){
    super(quantity,calories,wei);
    }
    public void name(){
        System.out.println("RasagullaSweet");
    }
    public int getquantity(){
    	return quantity;
    }
    public String getname(){
        return "Rasagulla";
   }
    public int getweight(){
    	return wei;
    }
}