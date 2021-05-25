package com.dev;

public class DigitChecker {
	public static boolean validateDigit(int number) {
		return String.valueOf(number).length() == 3;
	}
}
