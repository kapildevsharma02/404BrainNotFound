package com.practice.string;

public class MailingProblem {

	public static int timeTakenToMail(String keyboard, String s) {
		// Write your code here
		int pointerForSString = 0;
		int indexOfKeyboard = 0;
		int i = 0;
		int answer = 0;
		while (pointerForSString != s.length()) {
			char c = s.charAt(pointerForSString);
			int lastIndex = indexOfKeyboard;
			indexOfKeyboard = keyboard.indexOf(c);
			answer += Math.abs(lastIndex - indexOfKeyboard);
			++pointerForSString;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = timeTakenToMail("zyxwvutsrqponmlkjihgfedcba", "zayb");
		System.out.println(answer);
	}
}
