package Exercises;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator calc = new Calculator();
	
	@Test
	public void testAddition() {
		int expectedTotal = 3;
		assertEquals(expectedTotal, calc.addition(1, 2));
	}

	// assertTrue (val1 < val2)
	@Test
	public void testIslessThanIsTrue() {
		assertTrue(calc.isLessThan(1, 5));
	}
		
	// assertFalse (val1 > val2)
	@Test
	public void testIslessThanIsFalse() {
		assertFalse(calc.isLessThan(5, 4));
	}
	
	//assertNull (str3)
	@Test
	public void testNothing() {
		assertNull(calc.nothing());
	}
	
	// check if two object references point to the same object
	@Test
	public void testsameObject() {
		String str4 = "WA";
		assertSame(str4, calc.sameObject());
	}
	
	// check if two object references not point to the same object
	// assertNotSame (str1, str2)
	@Test
	public void testObjectOne() {
		String str2 = "Two";
		assertNotSame(str2, calc.objectOne());
	}
	
	// check whether 2 arrays are equal to each other
	// assertArrayEquals(expectedArray, resultArray)
	@Test
	public void testStates() {
		String[] state2 = {"WA", "OR", "MT"};
		assertArrayEquals(state2, calc.states());
	}


}
