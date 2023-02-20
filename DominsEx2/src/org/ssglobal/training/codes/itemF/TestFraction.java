package org.ssglobal.training.codes.itemF;

public class TestFraction {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(3, 7);
		
		f1.printRational();
		f2.multiply(f1).printRational();
		f2.add(f1).printRational();
		
		System.out.println(f2.add(f1).getDenominator());
		System.out.println(f2.greaterEqual(f1));
		
	}

}
