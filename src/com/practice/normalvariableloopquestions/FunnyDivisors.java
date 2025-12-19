package com.practice.normalvariableloopquestions;

import java.util.ArrayList;
import java.util.Arrays;

public class FunnyDivisors {

	public static int findSum(int n, ArrayList<Integer> arr) {

		// Write your code here
		int answer = arr.stream().filter(x -> x % 2 == 0 || x % 3 == 0).mapToInt(Integer::intValue).sum();
		return answer;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = findSum(7, new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
		System.out.println(answer);

	}

}
