package com.epam.task2.epamtask;

class Halwa extends Sweets implements Gift{
    Halwa(int quantity,int calories,int wei){
    super(quantity,calories,wei);
    }
    public void name(){
        System.out.println("HalwaSweet");
    }
    public int getquantity(){
    	return quantity;
    }
    public String getname(){
        return "Halwa";
   }
    public int getweight(){
    	return wei;
    }
}
