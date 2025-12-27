package com.practice.string;

public class CheckIfTheDoorIsOpenorClosed {

	public static boolean square(int x) {
		int sq = (int) Math.sqrt(x);
		if (sq * sq == x) {
			return true;
		}
		return false;
	}

	public static String doorStatus(int n) {
		// Write your code here
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			if (square(i) == true) {
				sb.append('1');
			} else {
				sb.append('0');
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = doorStatus(5);
		System.out.println(ans);
	}

}
