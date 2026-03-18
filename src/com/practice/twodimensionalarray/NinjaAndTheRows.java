package com.practice.twodimensionalarray;

public class NinjaAndTheRows {

	public static int maximumWeightRow(int n, int m, int[][] mat) {
		// Write your code here.
		int answer = 0;
		int sum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			sum = 0;
			for (int j = 0; j < m; j++) {
				sum += mat[i][j];
			}
			answer = Math.max(answer, sum);
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer=maximumWeightRow(2, 3, new int[][] {{1,2,3},{2,0,0}});
		System.out.println(answer);
	}

}
