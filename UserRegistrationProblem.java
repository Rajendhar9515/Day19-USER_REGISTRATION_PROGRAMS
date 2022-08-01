package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
	public static void main(String[] args) {

		System.out.println("\t WELCOME TO USER REGISTRATION PROBLEM \n");

		Scanner input = new Scanner(System.in);

		// UC-1 :- As a User need to enter a valid First Name.
		System.out.println("Enter First Name");
		String first_name = input.nextLine();
		boolean b = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", first_name);
		System.out.println(b);

		// UC-2 :- As a User need to enter a valid Last Name.
		System.out.println("Enter last Name");
		String last_name = input.nextLine();
		boolean b1 = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", last_name);
		System.out.println(b1);

		// UC-3:- As a User need to enter a valid email.
		System.out.println("Enter Email");
		String email = input.nextLine();
		boolean b2 = Pattern.matches("^(.+)@(\\S+)$", email);
		System.out.println(b2);

	}

}
