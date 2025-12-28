package com.practice.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Maximum1s {

	public static int maxOne(ArrayList<ArrayList<Integer>> arr) {

		// Write your code here
//		Collections.sort(Collections.sort(arr));
		int maxSum = 0;
		int index = 0;
		int count = 0;
		for (int i = 0; i < arr.size(); i++) {
			count = 0;
			for (int j = arr.get(0).size() - 1; j >= 0; j--) {
				if (arr.get(i).get(j) == 1) {
					count++;
				} else {
					break;
				}
			}
			if (count == arr.get(0).size()) {
				return i;
			}
			if (maxSum < count) {
				maxSum = count;
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = maxOne(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(0, 0, 1, 1)),
				new ArrayList<>(Arrays.asList(0, 0, 0, 0)), new ArrayList<>(Arrays.asList(1, 1, 1, 1)))));
		System.out.println(answer);
	}

}