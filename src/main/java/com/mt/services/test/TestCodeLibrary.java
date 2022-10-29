package com.mt.services.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestCodeLibrary {
	public static void main(final String[] ass) {
		final CodeLibrary obj = new CodeLibrary();
		obj.isPalindrome("LIRIL");
	}

	@Test
	public void testMessageNull() {
		final CodeLibrary obj = new CodeLibrary();
		assertEquals("Please provide a name!", obj.getMessage(null));
	}

	@Test
	public void testNameFreshKite() {
		final CodeLibrary obj = new CodeLibrary();
		assertEquals("Hello Fresh Kite", obj.getMessage("Fresh Kite"));
	}

	@Test
	public void whenEmptyString_thenAccept() {
		final CodeLibrary obj = new CodeLibrary();
		assertTrue(obj.isPalindrome(""));
	}

	@Test
	public void wheNonEmptyString() {
		final CodeLibrary obj = new CodeLibrary();
		assertTrue(!obj.isPalindrome("KITE"));
	}

	@Test
	public void whenItIsAPalindrome() {
		final CodeLibrary obj = new CodeLibrary();
		assertTrue(obj.isPalindrome("LIRIL"));
	}
}
