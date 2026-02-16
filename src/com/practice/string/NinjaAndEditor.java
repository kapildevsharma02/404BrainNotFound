package com.practice.string;

//Input - CodingNinjasIsACodingPlatform
//Output - coding ninjas is a coding platform

public class NinjaAndEditor {
	public static String editSentence(String str) {
		// Write your code here.
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (i != 0 && c >= 65 && c <= 90) {
				sb.append(" ");
				sb.append((char) (c + 32));
			} else if (i == 0 && c >= 65 && c <= 90) {
				sb.append((char) (c + 32));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = editSentence("CodingNinjasIsACodingPlatform");
		System.out.println(ans);
	}

}
