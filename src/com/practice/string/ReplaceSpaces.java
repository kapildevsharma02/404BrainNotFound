package com.practice.string;
public class ReplaceSpaces {

	public static StringBuilder replaceSpaces(StringBuilder str) {
		// Write your code here.
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				sb.append("@40");
			} else {
				sb.append(str.charAt(i));
			}
		}
		return sb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = replaceSpaces(new StringBuilder("Coding Ninjas Is A Coding Platform"));
		System.out.println(sb);
	}
}