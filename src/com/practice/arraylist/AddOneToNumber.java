//checking the code show to khswtic bhai 
package com.practice.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOneToNumber {

	public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr) {
		// Write your code here.
		ArrayList<Integer> ans = new ArrayList<>();
		int count = 1;
		int sum = 0;
		for (int i = arr.size() - 1; i >= 0; i--) {
			sum = arr.get(i) + count;
			if (sum > 9) {
				ans.add(0);
				count = 1;
				sum = 0;
			} else {
				ans.add(sum);
				count = 0;
				sum = 0;
			}
		}
		if (count == 1) {
			ans.add(count);
		}

		ArrayList<Integer> finalAnswer = new ArrayList<>();
		int flag = 0;
		for (int i = ans.size() - 1; i >= 0; i--) {
			if (ans.get(i) == 0 && flag == 0) {
				continue;
			} else {
				flag = 1;
				finalAnswer.add(ans.get(i));
			}
		}
		return finalAnswer;
	}

	public static void main(String[] args) {
		ArrayList<Integer> ans = addOneToNumber(new ArrayList<Integer>(Arrays.asList(9, 9, 1)));
		System.out.println(ans);
	}

}
