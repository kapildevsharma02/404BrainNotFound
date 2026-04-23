package com.practice.normalvariableloopquestions;

/*
 * You are given an integer ‘NUM’ . 
 * Your task is to find out whether this number is an Armstrong number or not.

A k-digit number ‘NUM’ is an Armstrong number if and only if the k-th power of each digit sums to ‘NUM’.

Example
153 = 1^3 + 5^3 + 3^3.

Therefore 153 is an Armstrong number.
 */
public class ArmstrongNumber {

	public static boolean isArmstrong(int num) {
		// write your code here;
		int digit = digits(num);
		int temp = num;
		int sum = 0;
		while (temp != 0) {
			sum += Math.pow(temp % 10, digit);
			temp = temp / 10;
		}
		if (sum == num) {
			return true;
		}
		return false;
	}

	public static int digits(int num) {
		int temp = num;
		int count = 0;
		while (temp != 0) {
			temp = temp / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ans = isArmstrong(153);
		if (ans == true) {
			System.out.println("Yes its armstrong number");
		} else {
			System.out.println("No its not armstrong number");
		}
	}
}
