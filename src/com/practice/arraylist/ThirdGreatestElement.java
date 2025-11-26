package com.practice.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThirdGreatestElement {
	public static int findThirdLagrest(ArrayList<Integer> arr) {
		// Write your code here.
		Collections.sort(arr);
		return arr.get(arr.size() - 3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = findThirdLagrest(new ArrayList<Integer>(Arrays.asList(2, 6, 7, 4, 9)));
		System.out.println(answer);
	}

}
