package com.practice.string;

public class Patternify {
	public static String[] printPatt(int n) {

		// Write your code here
		String[] answer = new String[n];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append("*");
		}
		int j = 0;
		for (int i = 0; i < n; i++) {
			answer[j] = sb.substring(0, n - i);
			j++;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []answer=printPatt(6);
		for(String ans:answer) {
			System.out.println(ans);
		}
	}

}
