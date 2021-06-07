/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Shobith Bandaru
 */
import java.util.*;

public class Excercise5 {
	public static void main(String[] args) {
	
	System.out.print("What is the first number? ");
	Scanner sc = new Scanner(System.in);
	String input1 = sc.nextLine();
	
	if(input1 == null || input1.equals(""))
	System.out.println("String cannot be parsed into an integer.");
	int num1 = Integer.parseInt(input1);
	
	System.out.print("What is the second number? ");
	String input2 = sc.nextLine();
	if(input2 == null || input2.equals(""))
	System.out.println("String cannot be parsed into an integer.");
	int num2 = Integer.parseInt(input2);
	
			int sum = num1+num2;
			int diff = num1-num2;
			int product = num1*num2;
			int quotient = num1/num2;
	System.out.print(num1+" + "+num2+" = "+sum+"\n"+num1+" - "+num2+" = "+diff+"\n"+num1+" * "+num2+" = "+product+"\n"+num1+" / "+num2+" = "+quotient+"\n");

}}
		