package com.epam.task2.epamtask;

class Rasamalai extends Sweets implements Gift{
    Rasamalai(int quantity,int calories,int wei){
    super(quantity,calories,wei);
    }
    public void name(){
        System.out.println("RasamalaiSweet");
    }
    public int getquantity(){
    	return quantity;
    }
    public String getname(){
        return "Rasamalai";
   }
    public int getweight(){
    	return wei;
    }
}