package com.exceptionandlogging.logging;

public class Simpleinterest {
	 public double principle;
     public double rateofinterest;
    public int time;
     Simpleinterest(){
    	 this.principle=10000.0;
    	 this.rateofinterest=3.5;
    	 this.time=5;
     }
     public double getinterest() {
    	 return (principle*time*rateofinterest)/100;
     }
}
