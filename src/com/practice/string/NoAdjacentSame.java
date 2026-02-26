package com.practice.string;

public class NoAdjacentSame {
	public static boolean checkBits(int n) {
		// Write your code here.
		String s=Integer.toBinaryString(n);
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				return false;
			}
		}
		return true; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ans = checkBits(31);
		if (ans) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
