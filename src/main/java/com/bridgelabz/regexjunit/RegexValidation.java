package com.bridgelabz.regexjunit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidation {

	Scanner SC = new Scanner(System.in);

//		Partern For First Name
	boolean validFirstName() {
// 		Veriable
		String firstName;
		System.out.println("Enter Your First Name :-");
		firstName = SC.next();
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher matcher = pattern.matcher(firstName);
//		Condition
		boolean matchFound = matcher.matches();
		if (matchFound) {
			System.out.println("First Name is Correct");
		} else {
			System.out.println("First Namer is Inorrect");
		}
		System.out.println();
		return matchFound;
	}

//		Partern For Last Name
	boolean validLastName() {
// 		Veriable
		String lastName;
		System.out.println("Enter Your Last Name :-");
		lastName = SC.next();
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher matcher = pattern.matcher(lastName);
//		Condition
		boolean matchFound = matcher.matches();
		if (matchFound) {
			System.out.println("Last Name is Correct");
		} else {
			System.out.println("Last Name is Inorrect");
		}
		System.out.println();
		return matchFound;
	}

//	Partern For E-Mail
	boolean validEmail() {
// 		Veriable
		String validEmail;
		System.out.println("Enter Your Email :-");
		validEmail = SC.next();
		Pattern pattern = Pattern.compile("^[a-z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		Matcher matcher = pattern.matcher(validEmail);
//			Condition
		boolean matchFound = matcher.matches();
		if (matchFound) {
			System.out.println("Email is Correct");
		} else {
			System.out.println("Email is Inorrect");
		}
		System.out.println();
		return matchFound;
	}

//	Partern For Mobile Number
	boolean validMobileNumber() {
// 		Veriable
		String validMobileNumber;
		System.out.println("Enter Your Mobile Number :-");
		validMobileNumber = SC.next();
		Pattern pattern = Pattern.compile("^(0|91)?[7-9][0-9]{9}$");
		Matcher matcher = pattern.matcher(validMobileNumber);
//			Condition
		boolean matchFound = matcher.matches();
		if (matchFound) {
			System.out.println("Mobile Number is Correct");
		} else {
			System.out.println("Mobile Number is Inorrect");
		}
		System.out.println();
		return matchFound;
	}

//	Partern For Password
	boolean validPassword() {
// 		Veriable
		String validPassword;
		System.out.println("Enter Your Password :-");
		validPassword = SC.next();
		Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8}$");
		Matcher matcher = pattern.matcher(validPassword);
//			Condition
		boolean matchFound = matcher.matches();
		if (matchFound) {
			System.out.println("Given Password is Correct");
		} else {
			System.out.println("Given Password is Inorrect");
		}
		System.out.println();
		return matchFound;
	}
}