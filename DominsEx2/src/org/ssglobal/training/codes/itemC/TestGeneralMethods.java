package org.ssglobal.training.codes.itemC;

public class TestGeneralMethods {

	public static void main(String[] args) {
		GeneralMethods gen = new GeneralMethods();
		gen.powersOfTwo();
		gen.alarm(7);
		short sumOf = gen.sum100();
		System.out.println(sumOf);
		int sumRange = gen.sumRange(1, 10);
		System.out.println(sumRange);
		int max = gen.maxOfTwo(5, 7);
		System.out.println(max);
		boolean larger = gen.larger(5, 1);
		System.out.println(larger);
		boolean evenly = gen.evenlyDivisible(10, 10);
		System.out.println(evenly);
	}

}
