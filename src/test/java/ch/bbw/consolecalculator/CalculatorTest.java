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
	@Test
	public void test_addition_with_2_positive_numbers() {
	  assertEquals(4, testee.summe(2, 2));
		
	}
	@Test
	public void test_addition_with_2_negative_numbers() {
	  assertEquals(-20, testee.summe(-5, -15));
		
	}
	
	@Test
	public void test_subtraction_with_2_positive_numbers() {
		  assertEquals(5, testee.differenz(20, 15));
			
	}
	
	@Test
	public void test_subtraction_with_2_negative_numbers() {
		  assertEquals(1, testee.differenz(-1, -2));
			
	}

}
