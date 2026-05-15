package com.practice.arraylist;

import java.util.ArrayList;

public class SelfDividingNumbers {
	public static ArrayList<Integer> findAllSelfDividingNumbers(int lower, int upper) {
		// Write your code here.
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = lower; i <= upper; i++) {
			int temp = i;
			int count = 1;
			while (temp != 0) {
				int last_digit = temp % 10;
				if (last_digit != 0 && i % last_digit == 0) {
					temp = temp / 10;
				} else {
					count = 0;
					break;
				}
			}
			if (count == 1) {
				ans.add(i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ans = findAllSelfDividingNumbers(15, 45);
		System.out.println(ans);
	}

}
