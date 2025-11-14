package com.practice.array;

public class FlipGivenBits {

	public static int flipSomeBits(int num, int[] arr, int n) {
		// Write your code here.
		int maximum = Integer.MIN_VALUE;
		for (int e : arr) {
			if (e > maximum) {
				maximum = e;
			}
		}

		System.out.println("maximum is " + maximum);

		int answer = 0;
		String ans = Integer.toBinaryString(num);
		while (ans.length() < maximum) {
			ans = '0' + ans;
		}
		char[] ansArray = ans.toCharArray();

		System.out.println("This is the binary string " + ans);

		int len = ansArray.length;
		for (int i = 0; i < arr.length; i++) {
			if (ansArray[len - arr[i]] == '1') {
				ansArray[len - arr[i]] = '0';
			} else {
				ansArray[len - arr[i]] = '1';
			}
		}
		int count = 0;
		int finalAnswer = 0;
		for (int i = ansArray.length - 1; i > -1; i--) {
			if (ansArray[i] == '1') {
				finalAnswer += Math.pow(2, count);
			}
			count++;
		}
		return finalAnswer;

	}

	public static void main(String[] args) {
		int answer = flipSomeBits(21, new int[] { 4, 2, 1 }, 3);
		System.out.println("--");
		System.out.println(answer);
	}
}
