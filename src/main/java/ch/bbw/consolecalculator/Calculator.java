package ch.bbw.consolecalculator;

public class Calculator {

	public int summe(int summand1, int summand2) {
		return summand1 + summand2;
	}
	public int differenz(int minuend, int subtrahend) {
		return minuend - subtrahend;
	}
	public int division(int dividend, int divisor) {
		if(divisor == 0) {
			throw new ArithmeticException();
		}
		return dividend / divisor;
	}
	public int multiplikation(int multiplikator1, int multiplikator2) {
		return multiplikator1 * multiplikator2;
	}
}
