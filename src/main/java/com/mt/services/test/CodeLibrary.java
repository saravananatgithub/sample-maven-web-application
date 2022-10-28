package com.mt.services.test;

public class CodeLibrary {
	public String getMessage(final String name) {
		final StringBuilder result = new StringBuilder();
		if (name == null || name.trim().length() == 0) {
			result.append("Please provide a name!");
		} else {
			result.append("Hello " + name);
		}
		return result.toString();
	}

	public boolean isPalindrome(final String str) {
		String reverseStr = "";
		final int strLength = str.length();
		for (int i = strLength - 1; i >= 0; --i) {
			reverseStr = String.valueOf(reverseStr) + str.charAt(i);
		}
		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(String.valueOf(str) + " is a Palindrome String.");
			return true;
		}
		System.out.println(String.valueOf(str) + " is not a Palindrome String.");
		return false;
	}
}