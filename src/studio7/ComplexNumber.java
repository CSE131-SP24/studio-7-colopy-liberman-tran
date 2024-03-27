package studio7;

public class ComplexNumber {

	private double realNum;
	private double imagNumI;

	public ComplexNumber(double initReal, double initImag) {

		realNum = initReal;
		imagNumI = initImag;

	}
	/**
	 * Calculates the sum of 2 complex numbers
	 * 
	 * @param num1
	 * @return
	 */
	public ComplexNumber sum(ComplexNumber num1) {

		ComplexNumber newNumber = new ComplexNumber(this.realNum + num1.realNum, this.imagNumI + num1.imagNumI);

		return newNumber;

	}
	/**
	 * Calculates the product of 2 complex numbers
	 * 
	 * @param num1
	 * @return
	 */
	public ComplexNumber product(ComplexNumber num1) {

		ComplexNumber newNumber = new ComplexNumber((this.realNum * num1.realNum) - (this.imagNumI * num1.imagNumI), (this.realNum * num1.imagNumI) + (num1.realNum * this.imagNumI));

		return newNumber;

	}
	/**
	 * Converts complex number to String
	 */
	public String toString() {
		String string = this.realNum + " + " + this.imagNumI + "i";

		return string;

	}

	public static void main(String[] args) {
		ComplexNumber num1 = new ComplexNumber(5, 6);
		ComplexNumber num2 = new ComplexNumber(2, 7);

		System.out.println(num1);
		System.out.println(num2);

		System.out.println("Added = " + num1.sum(num2).toString());
		System.out.println("Multiplied = " + num1.product(num2).toString());


	}

}
