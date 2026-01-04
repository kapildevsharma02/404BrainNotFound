package com.practice.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class LeadersInAnArray {

	public static ArrayList<Integer> findLeaders(ArrayList<Integer> elements, int n) {
		// Write your code here
		ArrayList<Integer> ans = new ArrayList<>();
		int lastElement = elements.get(elements.size() - 1);
		int maxElement = lastElement;
		ans.add(maxElement);
		for (int i = elements.size() - 2; i >= 0; i--) {
			int temp = elements.get(i);
			if (temp > maxElement) {
				maxElement = temp;
				ans.add(maxElement);
			}
		}
		ArrayList<Integer> finalAnswer = new ArrayList<>();
		for (int i = ans.size() - 1; i >= 0; i--) {
			finalAnswer.add(ans.get(i));
		}
		return finalAnswer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ans = findLeaders(new ArrayList<>(Arrays.asList(6,5,4,3,2,1)), 6);
		System.out.println(ans);
	}

}
