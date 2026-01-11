package com.practice.normalvariableloopquestions;

public class WinOrLose {

	public static String winOrLose(int N) {
		if (N % 2 == 0) {
			return "YES";
		}
		if (N % 2 != 0) {
			return "NO";
		}
		return "";
	}

	public static void main(String[] args) {
		String ans = winOrLose(16);
		System.out.println(ans);
	}

}
