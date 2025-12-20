package com.practice.array;

public class LeftRotateAnArrayByOne {

	static int[] rotateArray(int[] arr, int n) {
		// Write your code here.
		for (int i = 0; i < n - 1; i++) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans[] = rotateArray(new int[] { 5, 7, 3, 2 }, 4);
		for (int e : ans) {
			System.out.print(e + " ");
		}
	}

}
