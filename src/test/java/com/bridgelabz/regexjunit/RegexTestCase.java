package com.bridgelabz.regexjunit;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.bridgelabz.regexjunit.RegexValidation;

//@RunWith(JUnitPlatform.class)
public class RegexTestCase {

	@Before
	public void check_Valid_Firstname() {
		RegexValidation regex = new RegexValidation();
		boolean check = regex.validFirstName();
		assertTrue(check);
	}

	@Test
	public void check_Valid_Lastname() {
		RegexValidation regex = new RegexValidation();
		boolean check = regex.validLastName();
		assertTrue(check);
	}

	@After
	public void check_Valid_Emaile() {
		RegexValidation regex = new RegexValidation();
		boolean check = regex.validEmail();
		assertTrue(check);
	}

	@After
	public void check_Valid_MobileNumber() {
		RegexValidation regex = new RegexValidation();
		boolean check = regex.validMobileNumber();
		assertTrue(check);
	}

	@After
	public void check_Valid_Password() {
		RegexValidation regex = new RegexValidation();
		boolean check = regex.validPassword();
		assertTrue(check);
	}
}