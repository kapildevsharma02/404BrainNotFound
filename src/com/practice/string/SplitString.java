package com.practice.string;

public class SplitString {

	public static boolean countVowel(String s1, String s2) {
		int firstStringVowel = 0;
		int secondStringVowel = 0;
		for (int i = 0; i < s1.length(); i++) {
			if ((s1.charAt(i) == 'a') || (s1.charAt(i) == 'A') || (s1.charAt(i) == 'e') || (s1.charAt(i) == 'E')
					|| (s1.charAt(i) == 'e') || (s1.charAt(i) == 'i') || (s1.charAt(i) == 'I') || (s1.charAt(i) == 'o')
					|| (s1.charAt(i) == 'O') || (s1.charAt(i) == 'u') || (s1.charAt(i) == 'U')) {
				firstStringVowel++;
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			if ((s2.charAt(i) == 'a') || (s2.charAt(i) == 'A') || (s2.charAt(i) == 'e') || (s2.charAt(i) == 'E')
					|| (s2.charAt(i) == 'e') || (s2.charAt(i) == 'i') || (s2.charAt(i) == 'I') || (s2.charAt(i) == 'o')
					|| (s2.charAt(i) == 'O') || (s2.charAt(i) == 'u') || (s2.charAt(i) == 'U')) {
				secondStringVowel++;
			}
		}
		return firstStringVowel == secondStringVowel;
	}

	public static Boolean splitString(String str) {
		// Write your code here..
		int low = 0;
		int right = str.length();
		int middle = (low + right) / 2;
		return countVowel(str.substring(0, middle), str.substring(middle, right));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean ans = splitString("helloworld");
		System.out.println(ans);
	}
}
