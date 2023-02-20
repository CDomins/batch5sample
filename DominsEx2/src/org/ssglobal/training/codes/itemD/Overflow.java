package org.ssglobal.training.codes.itemD;

public class Overflow {
	public static boolean sumOverflow(byte x, byte y) {
		int sum = x + y;
		return (sum > 127 || sum < -128) ? true : false;
	}
}
