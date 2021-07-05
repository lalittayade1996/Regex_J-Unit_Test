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
		return matchFound;
	}
}