package com.practice.array;

//Remember this is not optimized approach 
//We can solve this in O(logn) as well.

public class MissingNumberInArithmeticProgression {

	public static int missingNumber(int[] arr, int n) {
		// Write your code here
		int nt = n + 1;
		int difference = (arr[arr.length - 1] - arr[0]) / (nt - 1);
		int firstterm = arr[0];
		int lastterm = arr[n - 1];
		for (int i = 0; i < n - 1; i++) {
			firstterm = firstterm + difference;
			if (firstterm == arr[i + 1]) {
				continue;
			} else {
				return firstterm;
			}
		}
		return lastterm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = missingNumber(new int[] { 5, 10, 20, 25 }, 4);
		System.out.println(answer);
	}

}