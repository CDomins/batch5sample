package org.ssglobal.training.codes.itemC;

public class GeneralMethods {
	public void powersOfTwo() {
		int start = 2;
		
		for (int count = 1; count <= 10; count++ ) {
			System.out.println(start *= 2);
		}
	}
	
	public void alarm(int num) {
		for (int count = 1; count <= num; count++) {
			System.out.println("Alarm!");
		}
	}
	
	public short sum100() {
		short sumOf = 0;
		
		for (int count = 1; count <= 100; count++) {
			sumOf += count;
		}
		return sumOf;
	}
	
	public int sumRange(int range1, int range2) {
		int sumRange = 0;
		
		for (int count = range1; count <= range2; count++) {
			sumRange = sumRange + range1;
		}
		return sumRange;
	}
	
	public int maxOfTwo(int number1, int number2) {
		return number1 > number2 ? number1 : number2;
	}
	
	public boolean larger(double number1, double number2) {
		return number1 > number2 ? true : false;
	}
	
	public boolean evenlyDivisible(int number1, int number2) {
		return number1 % number2 == 0 && number2 % number1 == 0 ? true : false;
	}
}
