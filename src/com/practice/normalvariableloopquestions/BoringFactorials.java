package com.practice.normalvariableloopquestions;

public class BoringFactorials {

	public static int boringFactorials(int n, int p) {
		// Write your code here.
		int answer = 1;
		for (int i = 1; i <= n; i++) {
			answer = (answer * i) % p;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = boringFactorials(10, 7);
		System.out.println(answer);
	}

}
