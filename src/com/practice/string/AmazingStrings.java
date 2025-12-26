package com.practice.string;

import java.util.Arrays;

public class AmazingStrings {
	public static String amazingStrings(String s1, String s2, String s3) {
		// Write your code here.
		s1 += s2;
		char[] array1 = s1.toCharArray();
		char[] array3 = s3.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array3);
		if (array1.length != array3.length) {
			return "NO";
		}
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array3[i]) {
				return "NO";
			}
		}
		return "YES";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans=amazingStrings("CODING", "NINJA", "NINCODINGJA");
		System.out.println(ans);

	}

}
