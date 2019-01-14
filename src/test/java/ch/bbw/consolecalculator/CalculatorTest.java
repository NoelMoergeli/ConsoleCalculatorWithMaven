package ch.bbw.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator testee;

	@Before
	public void setUp() {
		testee = new Calculator();

	}
	
	//ADDITION TESTEN
	@Test
	public void test_addition_with_2_positive_numbers() {
	  assertEquals(4, testee.summe(2, 2));
		
	}
	@Test
	public void test_addition_with_2_negative_numbers() {
	  assertEquals(-20, testee.summe(-5, -15));
		
	}
	
	@Test
	public void test_addition_with_2_0_numbers() {
		  assertEquals(0, testee.summe(0, 0));
			
	}
	
	@Test
	public void test_addition_with_1_positive_number_and_1_negative_number() {
		  assertEquals(15, testee.summe(20, -5));
			
	}
	
	@Test
	public void test_addition_with_maxValue_OK() {
		  assertTrue(testee.summe(Integer.MAX_VALUE, 0) == Integer.MAX_VALUE);
			
	}
	
	@Test
	public void test_addition_with_minValue_OK() {
		  assertTrue(testee.summe(Integer.MIN_VALUE, 0) == Integer.MIN_VALUE);
			
	}
	
	@Test
	public void test_addition_with_maxValue_NOK() {
		  assertFalse(testee.summe(Integer.MAX_VALUE, -2) == Integer.MAX_VALUE);
			
	}
	
	@Test
	public void test_addition_with_minValue_NOK() {
		  assertFalse(testee.summe(Integer.MIN_VALUE, 2) == Integer.MIN_VALUE);
			
	}
	
	
	//SUBTRAKTION TESTEN
	@Test
	public void test_subtraction_with_2_positive_numbers() {
		  assertEquals(5, testee.differenz(20, 15));
			
	}
	
	@Test
	public void test_subtraction_with_2_negative_numbers() {
		  assertEquals(1, testee.differenz(-1, -2));
			
	}
	
	@Test
	public void test_subtraction_with_2_0_numbers() {
		  assertEquals(0, testee.differenz(0, 0));
			
	}
	
	@Test
	public void test_subtraction_with_1_positive_number_and_1_negative_number() {
		  assertEquals(25, testee.differenz(20, -5));
			
	}
	
	@Test
	public void test_subtraction_with_maxValue_OK() {
		  assertTrue(testee.differenz(Integer.MAX_VALUE, 0) == Integer.MAX_VALUE);
			
	}
	
	@Test
	public void test_subtraction_with_minValue_OK() {
		  assertTrue(testee.differenz(Integer.MIN_VALUE, 0) == Integer.MIN_VALUE);
			
	}
	
	@Test
	public void test_subtraction_with_maxValue_NOK() {
		  assertFalse(testee.differenz(Integer.MAX_VALUE, 2) == Integer.MAX_VALUE);
			
	}
	
	@Test
	public void test_subtraction_with_minValue_NOK() {
		  assertFalse(testee.differenz(Integer.MIN_VALUE, -2) == Integer.MIN_VALUE);
			
	}
	
	//DIVISION TESTEN
	
	@Test
	public void test_division_with_2_positive_numbers() {
		  assertEquals(10, testee.division(20, 2));
			
	}
	
	@Test
	public void test_division_with_2_negative_numbers() {
		  assertEquals(-10, testee.division(-20, -2));
			
	}
	
	@Test(expected = ArithmeticException.class)
	public void test_division_with_2_0_numbers() {
		  assertEquals(0, testee.division(0, 0));
			
	}
	
	@Test
	public void test_division_with_1_positive_number_and_1_negative_number() {
		  assertEquals(-4, testee.division(20, -5));
			
	}
	
	@Test
	public void test_division_with_maxValue_OK() {
		  assertTrue(testee.division(Integer.MAX_VALUE, 0) == Integer.MAX_VALUE);
			
	}
	
	@Test
	public void test_division_with_minValue_OK() {
		  assertTrue(testee.division(Integer.MIN_VALUE, 0) == Integer.MIN_VALUE);
			
	}
	
	@Test
	public void test_division_with_maxValue_NOK() {
		  assertFalse(testee.division(Integer.MAX_VALUE, 2) == Integer.MAX_VALUE);
			
	}
	
	@Test
	public void test_division_with_minValue_NOK() {
		  assertFalse(testee.division(Integer.MIN_VALUE, -2) == Integer.MIN_VALUE);
			
	}
	//MULTIPLIKATION TESTEN

}
