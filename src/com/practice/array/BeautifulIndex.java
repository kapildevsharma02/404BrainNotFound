package com.practice.array;

public class BeautifulIndex {

	public static int beautifulIndex(int N, int[] A) {
		// Write your code here.
		int[] prefixArray = new int[N];
		int[] suffixArray = new int[N];

		int psum = 0;
		for (int i = 0; i < N; i++) {
			psum = psum + A[i];
			prefixArray[i] = psum;
		}

//		for (int a : prefixArray) {
//			System.out.print(a + " ");
//		}

		int ssum = 0;
		for (int i = N - 1; i >= 0; i--) {
			ssum = ssum + A[i];
			suffixArray[i] = ssum;
		}

//		for(int a:suffixArray) {
//			System.out.print(a+" ");
//		}

		for (int i = 0; i < N; i++) {
			if (prefixArray[i] == suffixArray[i]) {
				return i + 1;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = beautifulIndex(6, new int[] { 1, 7, 3, 6, 5, 6 });
		System.out.println(answer);
	}

}