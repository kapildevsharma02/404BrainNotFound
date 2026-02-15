package com.practice.biginteger;

import java.math.BigInteger;

public class AddBinaryStrings {
	public static String addBinaryString(String a, String b, int n, int m) {
		BigInteger x = new BigInteger(a, 2);
		BigInteger y = new BigInteger(b, 2);
		BigInteger sum = x.add(y);
		return sum.toString(2); // binary string
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = addBinaryString("111", "0", 3, 1);
		System.out.println(ans);
	}

}
