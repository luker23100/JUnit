package com.dev;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import static com.dev.DigitChecker.validateDigit;

public class DigitCheckerTest {
	
	@Test
	public void isNotValidWhenNumberLengthIsLessThan3() {
		//given
		int number = 23;
		
		//when
		boolean check = validateDigit(number);
		
		//then
		assertFalse(check);
	}
	
	@Test
	public void isNotValidWhenNumberLengthIsGreaterThan3() {
		//given
		int number = 43562;
		
		//when
		boolean check = validateDigit(number);
		
		//then
		assertFalse(check);
	}
	
	@Test
	public void isValidWhenNumberLengthIsEqualTo3() {
		//given
		int number = 857;
		
		//when
		boolean check = validateDigit(number);
		
		//then
		assertTrue(check);
	}
	
}
