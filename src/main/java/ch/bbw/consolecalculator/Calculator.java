package ch.bbw.consolecalculator;

public class Calculator {

	public int summe(int summand1, int summand2) {
		long value = (long) summand1 + (long) summand2;
		if((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return summand1 + summand2;
	}
	
	public int differenz(int minuend, int subtrahend) {
		long value = (long) minuend - (long) subtrahend;
		if((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return minuend - subtrahend;
	}
	
	public int division(int dividend, int divisor) {
		if(divisor == 0) {
			throw new ArithmeticException();
		}
		
		long value = (long) dividend / (long) divisor;
		if((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return dividend / divisor;
	}
	
	public int multiplikation(int multiplikator1, int multiplikator2) {
		long value = (long) multiplikator1 * (long) multiplikator2;
		if((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return multiplikator1 * multiplikator2;
	}
}
