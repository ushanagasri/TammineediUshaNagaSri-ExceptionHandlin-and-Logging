package com.exceptionandlogging.logging;

public class Compoundinterest {
	 public double initialbalance;
     public double rateofinterest;
    public int nooftimeperiods,numberoftimes;
     Compoundinterest(){
    	 this.initialbalance=1000.0;
    	 this.rateofinterest=3.5;
    	 this.nooftimeperiods=2;
    	 this.numberoftimes=3;
     }
     public double getinterest() {
    	 return initialbalance*Math.pow((1+rateofinterest/numberoftimes),numberoftimes*nooftimeperiods);

     }
}
