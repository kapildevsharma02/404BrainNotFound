package com.practice.string;

import java.util.HashMap;
import java.util.Map;
public class BitSet {

	public static int findFirstRepeatingDigit(String digitPattern) {
		// Write your code here.
		Map<Character, Integer> map = new HashMap<>();
		for (char c : digitPattern.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

			if (map.get(c) > 1) {
				int number = c - 48;
				return number;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Just checking the github connection!!");
	}
}
