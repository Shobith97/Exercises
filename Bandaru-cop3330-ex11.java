/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Shobith Bandaru
 */
import java.util.Scanner;

public class Excercise11{
   public static void main(String args[])
   {
   		double currency;
   		double rate;

    	System.out.print("How many euros are you exchanging? ");
    	Scanner sc = new Scanner(System.in);
       	currency = sc.nextDouble();
       	
       	System.out.print("What is the exchange rate? ");
       	rate = sc.nextDouble();

       	System.out.println(currency+" euros at an exchange rate of "+rate+" is");
       	double currencyConverted = currency*rate;
       	System.out.printf("%.2f U.S dollars.",currencyConverted);
         
         
   }
}