package com.practice.normalvariableloopquestions;

public class MoveZeroes {
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void moveZeroes(int[] nums) {
		int i = 0;
		int j = 0;
		while (j != nums.length) {
			if (nums[j] != 0) {
				swap(nums, i, j);
				i++;
				j++;
			} else {
				j++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moveZeroes(new int[] { 1, 0, 3, 0, 0, 4 });
		
	}

}
