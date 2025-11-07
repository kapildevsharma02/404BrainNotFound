package com.practice.string;

/*
 *
input   DesiredOutput      youroutput
5							
I			1				1
mom			1				1
			0				1
NiTIn		1				1
foo         0				0
 */
public class CountPalindromeWordsInAString {

	private static boolean checkPalindrome(String word) {
		if (word.isEmpty()) {
			return false;
		}
		// TODO Auto-generated method stub
		int s = 0;
		int e = word.length() - 1;
		while (s <= e) {
			if (word.charAt(s) != word.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}

	public static int countNumberOfPalindromeWords(String s) {
		// Write your code here!
		s = s.toLowerCase();
		int count = 0;
		String[] words = s.split(" ");
		for (String word : words) {
			boolean ans = checkPalindrome(word);
			if (ans) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = countNumberOfPalindromeWords("");
		System.out.println(answer);
	}

}
