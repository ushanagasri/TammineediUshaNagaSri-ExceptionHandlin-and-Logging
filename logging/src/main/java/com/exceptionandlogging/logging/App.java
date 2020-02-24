package com.exceptionandlogging.logging;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	LOGGER.info("Hello,");
    	Scanner sc=new Scanner(System.in);
        Simpleinterest simpleinterestobj=new Simpleinterest();
        double val=simpleinterestobj.getinterest();
        LOGGER.info("SimpleInterest is: ");
        LOGGER.info((float)val);
        Compoundinterest compoundinterestobj=new Compoundinterest();
        double compoundinterestvalue=compoundinterestobj.getinterest();
       LOGGER.info("CompoundInterest is: ");
       LOGGER.info((float)compoundinterestvalue);
        Construction c=new Construction();
        LOGGER.info("Enter Area ofthe house: ");
        double area=sc.nextDouble();
        LOGGER.info("1200INR if we use standard materials\n"+"1500INR if we use above standard materials\n"+"1800INR  for high standard material\n"
        		+"2500INR for high standard material and fully automated home\n");
        LOGGER.info("Enter the type:\n"+"1.standard\n"+"2.Above standard\n"+"3.High standard\n"+"4.High standard and fully automated home\n");
        int option=sc.nextInt();
        if(option<1 || option>4)
        	LOGGER.info("Select valid option from the list\n");
        else
        LOGGER.info((int)(Math.ceil(c.getcost(option,area)))+":is the Cost for construction");
    }
}
