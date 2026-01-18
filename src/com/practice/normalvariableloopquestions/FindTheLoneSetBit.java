package com.practice.normalvariableloopquestions;

public class FindTheLoneSetBit {
	public static int findSetBit(int n) {
		// WRITE YOUR CODE HERE
		if (n == 0 || (n & (n - 1)) != 0) {
			return -1;
		}
		return (int) (Math.log(n) / Math.log(2)) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
