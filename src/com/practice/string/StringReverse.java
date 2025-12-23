package com.practice.string;

public class StringReverse {
	public static String stringReverse(char[] arr) {
			
			int i = 0;
			int j = arr.length - 1;
			String ans=swap(arr, i, j);
			return ans;
		}
	
		public static String swap(char[] arr, int i, int j) {
			while (i < j) {
				char c = arr[i];
				arr[i] = arr[j];
				arr[j] = c;
				i++;
				j--;
			}
			return new String(arr);
		}
		public static void main(String[] args) {
			String ans=stringReverse(new char[] {'h','e','l','l','o'});
			System.out.println(ans);
		}
}

