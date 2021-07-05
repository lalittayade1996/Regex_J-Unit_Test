package com.bridgelabz.regexjunit;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bridgelabz.regexjunit.RegexValidation;

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
}
