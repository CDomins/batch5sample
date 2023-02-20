package org.ssglobal.training.codes.itemD;

public class TestOverflow {

	public static void main(String[] args) {
		byte x = 12;
		byte y = 25;
		boolean overFlow = Overflow.sumOverflow(x,y);
		System.out.println(overFlow);
	}

}
