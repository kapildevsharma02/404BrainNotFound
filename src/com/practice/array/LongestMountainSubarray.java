package com.practice.array;
//Subarray Question

public class LongestMountainSubarray {

	public static int longestMountain(int arr[], int n) {
		// Write your code here.
		int answer = 0;
		for (int i = 1; i <= n - 2; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				int j = i;
				int leftCount = 0;
				int rightCount = 0;
				while (j < arr.length - 1 && (arr[j] > arr[j + 1])) {
					leftCount++;
					j++;
				}
				j = i;
				while (j != 0 && (arr[j] > arr[j - 1])) {
					rightCount++;
					j--;
				}
				answer = Math.max(answer, leftCount + rightCount + 1);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = longestMountain(new int[] { 4, 8, 3, 9, 1, 2, 6, 5, 10 }, 9);
		System.out.println(answer);
	}

}