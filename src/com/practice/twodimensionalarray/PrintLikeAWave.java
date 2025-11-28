package com.practice.twodimensionalarray;

public class PrintLikeAWave {
	public static int[] wavePrint(int arr[][], int nRows, int mCols) {
		// Write your code here.
		int length = nRows * mCols;
		int[] answer = new int[length];
		int k = 0;
		for (int j = 0; j < mCols; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < nRows; i++) {
					answer[k] = arr[i][j];
					k++;
				}
			} else {
				for (int i = nRows - 1; i > -1; i--) {
					answer[k] = arr[i][j];
					;
					k++;
				}
			}
		}
		return answer;

	}

	public static void main(String[] args) {
		int[] answer = wavePrint(new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } }, 3, 4);
		for (int e : answer) {
			System.out.print(e + " ");
		}
	}

}
