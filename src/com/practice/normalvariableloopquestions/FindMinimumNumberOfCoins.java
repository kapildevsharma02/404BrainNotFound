package com.practice.normalvariableloopquestions;

import java.util.ArrayList;
import java.util.List;

public class FindMinimumNumberOfCoins {

	public static List<Integer> MinimumCoins(int n) {
		// Write your code here.
		List<Integer> answer = new ArrayList<>();
		int temp_copy = n;
		int i = 0;
		while (temp_copy != 0) {
			if (temp_copy >= 1000) {
				temp_copy -= 1000;
				answer.add(1000);
			} else if (temp_copy >= 500) {
				temp_copy -= 500;
				answer.add(500);
			} else if (temp_copy >= 100) {
				temp_copy -= 100;
				answer.add(100);
			} else if (temp_copy >= 50) {
				temp_copy -= 50;
				answer.add(50);
			} else if (temp_copy >= 20) {
				temp_copy -= 20;
				answer.add(20);
			} else if (temp_copy >= 10) {
				temp_copy -= 10;
				answer.add(10);
			} else if (temp_copy >= 5) {
				temp_copy -= 5;
				answer.add(5);
			} else if (temp_copy >= 2) {
				temp_copy -= 2;
				answer.add(2);
			} else if (temp_copy >= 1) {
				temp_copy -= 1;
				answer.add(1);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ans = MinimumCoins(10001);
		System.out.println(ans);
	}

}
