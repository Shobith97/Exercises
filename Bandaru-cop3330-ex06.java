/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Shobith Bandaru
 */
import java.util.*;
import java.lang.*;

public class Excercise6
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);   
       int current_year = Calendar.getInstance().get(Calendar.YEAR);

       System.out.print("What is your current age? ");   
       int age = sc.nextInt();
      
       System.out.print("At what age would you like to retire? ");       
       int retire_age = sc.nextInt();      
      
       int years_left = retire_age - age;        

       if(years_left <= 0)
       {
         System.out.println("The user can already retired.");
       }
       else
       {
         System.out.println("You have " + years_left + " years left until you can retire.");
         int retire_year = current_year + years_left;       
         System.out.println("It's " + current_year +", so you can retire in " + retire_year + ".");
       }

       

   }

}