package org.ssglobal.training.codes.itemF;

public class Fraction {
	public int numerator;
	public int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void printRational() {
		System.out.println(numerator + "/" + denominator);
	}

	public Fraction add(Fraction summand) {
		if (denominator != summand.getDenominator()) {
			int numeratorAdd = numerator * summand.getDenominator() + denominator * summand.getNumerator();
	        int denominatorAdd = denominator * summand.getDenominator();
	        
	        return new Fraction(numeratorAdd, denominatorAdd);
		} else {
			int numeratorAdd = numerator + summand.getNumerator();
			
			return new Fraction(numeratorAdd, denominator);
		} 
	}
	
	public Fraction multiply(Fraction factor) {
		int numeratorMulti = numerator * factor.getNumerator();
		int denominatorMulti = denominator * factor.getDenominator();
		
		return new Fraction(numeratorMulti, denominatorMulti);
	}
	
	public boolean greaterEqual(Fraction comp) {
		double fraction1 =  (double) numerator / denominator;
		double fraction2 = (double) comp.getNumerator() / comp.getDenominator();
		
		if (fraction1 >= fraction2) {
			return true;
		} else {
			return false;
		}
	}
}
