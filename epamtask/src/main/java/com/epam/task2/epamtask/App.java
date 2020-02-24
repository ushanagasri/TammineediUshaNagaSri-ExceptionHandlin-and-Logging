package com.epam.task2.epamtask;
import java.util.*;
import java.io.*;
public class App 
{
    public static void main( String[] args )
    {
    	Gift []gifts=new Gift[7];
        gifts[0]=new Waferchocolate(5,500,50);
        gifts[1]=new Nutchocolate(3,700,200);
        gifts[2]=new Cocochocolate(6,800,150);
        gifts[3]=new Candy(10,600,100);
        gifts[4]=new Rasamalai(5,1500,600);
        gifts[5]=new Rasagulla(4,2500,450);
        gifts[6]=new Halwa(1,3000,200);
System.out.println("Gift contains:");
int c1=0,c2=0;
  for(int i=0;i<7;i++){
     if(gifts[i] instanceof Chocolate){
         if(gifts[i] instanceof Waferchocolate){
             Waferchocolate w=(Waferchocolate) gifts[i];
             w.name();
         }
         else if(gifts[i] instanceof Nutchocolate){
             Nutchocolate n=(Nutchocolate) gifts[i];
             n.name();
         }
         else if(gifts[i] instanceof Cocochocolate){
             Cocochocolate co=(Cocochocolate) gifts[i];
             co.name();
         }
         else{            
         Candy c=(Candy) gifts[i];
             c.name();
         }
     }
     else{
         if(gifts[i] instanceof Rasamalai){
            Rasamalai r=(Rasamalai) gifts[i];
             r.name();
         }
         else if(gifts[i] instanceof Rasagulla){
             Rasagulla r2=(Rasagulla) gifts[i];
             r2.name();
         }
         else {
             Halwa h=(Halwa) gifts[i];
             h.name();
         }

     }
  }
  ArrayList<Chocolate> arr =new ArrayList<Chocolate>();
  for(int i=0;i<7;i++) {
	  if(gifts[i] instanceof Chocolate) {
		  Chocolate c=(Chocolate)gifts[i];
		  arr.add(c);
	  }
  }
  Collections.sort(arr,new Comparator<Chocolate>() {
	    @Override
	    public int compare(Chocolate  a, Chocolate b) {
	        return (a.quantity)-(b.quantity);
	    }
	});
  System.out.println("Chocolates after sorted by quantity:");
  for(int i=0;i<arr.size();i++) {
	  System.out.println(arr.get(i).getname()+" :"+arr.get(i).getquantity());
  }
  int weight=0;
  for(int i=0;i<7;i++) {
	  weight+=gifts[i].getweight();
  }
  System.out.println("Weight of the gift received by children: "+weight);
  for(int i=0;i<7;i++) {
	  if(gifts[i].getweight()<400)
		    c1++;
	  else
		  c2++;
  }
  System.out.println("Items having weight lessthen 400: "+c1);
  System.out.println("Items having weight greatethen 400: "+c2);
  
    }
}
