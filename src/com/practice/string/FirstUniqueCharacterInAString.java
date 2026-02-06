package com.practice.string;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
	public static char firstNonRepeating(String str) {
		// Write your code here
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)) == 1) {
				return str.charAt(i);
			}
		}
		return 'c';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ans = firstNonRepeating("bbabcbcb");
		System.out.println(ans);
	}

}