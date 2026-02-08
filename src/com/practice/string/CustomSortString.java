package com.practice.string;

public class CustomSortString {

	public static String specificOrder(String x, String y) {
		// Write your code here.

		String e = "";
		int u = x.length();
		String q = x;
		for (int i = 0; i < y.length(); i++) {
			char c = y.charAt(i);
			for (int j = 0; j < x.length(); j++) {
				if (x.charAt(j) == c) {
					e += c;
				}
			}
			q = q.replace(String.valueOf(c), "");
		}
		e = e + q;
		return e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = specificOrder("acabd", "abc");
		System.out.println(ans);
	}

}