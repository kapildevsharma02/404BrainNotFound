package com.practice.string;

public class OneSegment {

	public static boolean oneSegment(String str) {
		// Write your code here.
		int flag = 0;
		for (int i = 0; i < str.length(); i++) {
			if (flag == 0 && str.charAt(i) == '1') {
				continue;
			} else if (flag == 0 && str.charAt(i) == '0') {
				flag = 1;
			} else if (flag == 1 && str.charAt(i) == '1') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ans = oneSegment("000111");
		System.out.println(ans);
	}

}
