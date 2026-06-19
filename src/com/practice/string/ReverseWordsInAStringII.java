package com.practice.string;

public class ReverseWordsInAStringII {

	public static String reverseOrderWords(String str) {
		// Write your code here
		str = str.trim();
		StringBuilder answer = new StringBuilder();
//			StringBuilder word = new StringBuilder();
		String word = "";
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != ' ') {
				word += str.charAt(i);
			} else {
				answer.append(new StringBuilder(word).reverse().append(" "));
				word = "";
			}
		}
		answer.append(new StringBuilder(word).reverse());
		return answer.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = reverseOrderWords("When all else fails reboot");
		System.out.println(ans);
	}

}
