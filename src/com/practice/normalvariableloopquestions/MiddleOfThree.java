package com.practice.normalvariableloopquestions;
public class MiddleOfThree {

	private static int middleOfThree(int x, int y, int z) {
		int sum = x + y + z;// 12
		int max = Math.max(Math.max(x, y), z);// 6
		int min = Math.min(Math.min(x, y), z);// 2
		return sum - min - max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = middleOfThree(4, 3, 5);
		System.out.println(answer);
	}

}