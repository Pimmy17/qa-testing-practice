package com.qa.main.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.main.CodetoTest;

public class SimpleTest {

	@Test
	public void testSqrNum() {
		// First number (16) is what the answer should be and (4) is what is passed in
		assertEquals(16, CodetoTest.sqrNum(4));
		assertEquals(4, CodetoTest.sqrNum(2));
		assertEquals(36, CodetoTest.sqrNum(6));
	}

	@Test
	public void testDivNum() {
		assertEquals(5, CodetoTest.divNum(10));
	}

	@Test
	public void testWords() {
		assertTrue(CodetoTest.words("Hello World").startsWith("H"));
		assertEquals(CodetoTest.words("Hiya").length(), 4);
	}

	// BeforeClass needs to be static
	@BeforeClass
	public static void firstMsg() {
		System.out.println("Let the tests begin!");
	}

	// AfterClass needs to be static
	@AfterClass
	public static void lastMsg() {
		System.out.println("Is it safe to come out?");
	}

	@Before
	public void beforeEach() {
		System.out.println("Again!");
	}

	@After
	public void afterEach() {
		System.out.println("Woo Hoo!");
	}
}
