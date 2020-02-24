package com.exceptionandlogging.logging;

public class Construction {
	double cost;
    public double getcost(int option,double area) {
    	if(option==1)
    		this.cost=1200;
    	else if(option==2)
    		 this.cost=1500;
    	else if(option==3)
    		 this.cost=1800;
    	else if(option==4)
    		 this.cost=2500;
    	return this.cost*area;
    }
}
