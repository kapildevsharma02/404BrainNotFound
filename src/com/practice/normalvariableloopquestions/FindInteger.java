package com.practice.normalvariableloopquestions;

public class FindInteger {
	//Math Question
	public static int findInteger(int n, int k) {
		// Write your code here
		// My Code which gives TLE
//		if (k > 1 && n == 1) {
//			return 1;
//		}
//		int number = 1;
//		while (number <= n && k != 0) {
//			number = number + 2;
//			k--;
//		}
//		if (k == 0) {
//			return number-2;
//		}
//		int evenNumber = 0;
//		while (evenNumber < n && k != 0) {
//			evenNumber = evenNumber + 2;
//			k--;
//		}
//		return evenNumber;
//		

		int d = n / 2;
		if (n % 2 != 0) {
			d++;
		}
		if (k <= d) {
			return 2 * (k - 1) + 1;
		} else {
			k = k - d;
		}
		return 2 * k;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = findInteger(5, 3);
		System.out.println(answer);
	}

}
