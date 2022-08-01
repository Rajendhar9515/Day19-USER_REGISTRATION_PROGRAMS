package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		
		System.out.println("\t WELCOME TO USER REGISTRATION PROBLEM \n");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Name");
		String string = input.nextLine();
		
	   //UC-1 :- As a User need to enter a valid First Name.
		boolean b = Pattern.matches( "^[A-Z]{1}[a-z]{2,}$",string);
		System.out.println(b);
		
	}
	
}
