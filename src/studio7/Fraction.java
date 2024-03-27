package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int initNumerator, int initDenominator) {
		numerator = initNumerator;
		denominator = initDenominator;
	}
	/**
	 * Multiplies 2 fractions
	 * 
	 * @param frac1
	 * @return
	 */
	public Fraction multiplyFractions(Fraction frac1) {
		int newNumerator = this.numerator * frac1.numerator;
		int newDenominator = this.denominator * frac1.denominator;
		
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		
		return newFraction;
	}
	/**
	 * Adds 2 fractions
	 * 
	 * @param frac1
	 * @return
	 */
	public Fraction add(Fraction frac1) {
		Fraction newFrac = new Fraction((numerator * frac1.denominator) + (frac1.numerator * denominator), (denominator * frac1.denominator));
		
		return newFrac;
		
	}
	/**
	 * Finds reciprical
	 * 
	 * @return
	 */
	public Fraction reciprical() {
		Fraction newFraction = new Fraction(denominator, numerator);
		
		return newFraction;
	}
	/**
	 * Converts to String
	 * 
	 */
	public String toString() {
		String string = numerator + "/" + denominator;
		
		return string;
	}
	
	public static void main(String[] args) {
		
		Fraction frac1 = new Fraction(7, 9);
		Fraction frac2 = new Fraction(3, 2);
		
		System.out.println(frac1.toString());
		System.out.println(frac2.toString());
		
		System.out.println("Multiplied = " + frac1.multiplyFractions(frac2));
		System.out.println("Added = " + frac1.add(frac2));
		System.out.println("Reciprical = " + frac1.reciprical());
		
	}

}
