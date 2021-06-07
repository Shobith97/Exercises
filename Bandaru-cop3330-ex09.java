/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Shobith Bandaru
 */
import java.util.Scanner;
public class Excercise9
{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       double sqFeetPerGallon = 350;
       
       System.out.print("Enter length: ");
       double length = sc.nextDouble(); 
       
       System.out.print("Enter width: ");
       double width = sc.nextDouble(); 
       
       double totalSq = length*width;
       int gallon = (int)Math.ceil(totalSq/sqFeetPerGallon); 
       System.out.println("You will need to purchase "+gallon+" of paint to cover "+totalSq+" squre feet");
   }
}