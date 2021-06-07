/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Shobith Bandaru
 */
import java.util.Scanner;
public class Excercise2 {
    	public static void main(String[] args) {
		System.out.print("What is the input string? ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		if (input == "")
			System.out.println("User must enter something into the program");
		else {
			int count = input.length();
			System.out.print(input+" has "+count+" characters.");
		}
	}
}