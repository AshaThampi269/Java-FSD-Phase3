package com.howtodoinjava.junit5.examples;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;

@DisplayName("JUnit 5 Assertion Example")
//@RunWith(JunitPlatform.class)
public class Assertions {

	@Test
	@DisplayName("assert Examples")
	public void assertTest()
	{
		System.out.println("Test Method");
		String str = null;
		String str2 = ("some value");
		
		String [] a1 = {"A", "B"};
		String [] a2 = {"B", "A"};
		
		assertTrue(4>0);
		assertFalse(5<1);
		assertNull(str);
		assertNotNull(str2);
		
		assertSame(str,str);
		assertNotSame(str,str2);
		
		assertEquals(5,5);
		assertNotEquals(5,6);
		
		//assertArrayEquals(a1,a2);
		
		assertThrows(RuntimeException.class, () ->{
			throw new RuntimeException();
		});
	}
	
	@BeforeEach
	public void beforeAssert()
	{
		System.out.println("Before each test methods");
	}
	
	@AfterEach
	public void afterAssert()
	{
		System.out.println("After test methods");
	}
}
