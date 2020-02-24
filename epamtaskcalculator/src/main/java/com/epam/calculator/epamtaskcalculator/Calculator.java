package com.epam.calculator.epamtaskcalculator;
import java.io.*;
import java.util.Scanner;

public class Calculator {
	double a,b;
	char op;
	Calculator(){
	 Scanner sc=new Scanner(System.in);
	 int s=-1;
	 
	 while(s!=0) {
		 System.out.println("1.Enter 0 to exit\n2.Enter any other integer to perform calculations\n");
		 s=sc.nextInt();
		 if(s==0) { 
			 System.out.println("Exited");
			 break;
		 }
     System.out.println("Enter number1 operator number2:\n");
      a=sc.nextDouble();
      op=sc.next().charAt(0);
      b=sc.nextDouble();
     double v=0;
     int f=0;
     if(op=='+') {
  	   Add a1=new Add(a,b);
  	    v=a1.getvalue();
     }
     else if(op=='-') {
    	 Subtract sub=new Subtract(a,b);
    	  v=sub.getvalue();
     }
     else if(op=='*') {
    	Multiply m=new Multiply(a,b);
    	 v=m.getvalue();
     }
     else if(op=='%') {
    	 if(b==0) {
    		 System.out.println("Modulo with 0 is Undefined\n");
    		 f=1;
    	 }
    	 else {
    	 Remainder r=new Remainder(a,b);
    	  v=r.getvalue();
     }
     }
     else if(op=='/') {
    	 if(b==0) {
    		 System.out.println("Division with 0 is Undefined\n");
    		 f=1;
    	 }
    	 else {
    		 Divison d=new Divison(a,b);
    		  v=d.getvalue();
    	 }
     }
     else {
    	 System.out.println("Select a valid operator");
    	 f=1;
     }
     if(f==0)
     System.out.println("The value of "+a+" "+op+" "+b+" is "+v);
	}
	}
}
