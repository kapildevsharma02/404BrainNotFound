package com.practice.arraylist;

import java.util.ArrayList;
import java.util.List;

public class FahrenheittoCelsius {

	public static List<List<Integer>> fahrenheitToCelsius(int s, int e, int w) {
		// Write your code here
		List<List<Integer>> answer = new ArrayList<>();
		for (int i = s; i <= e; i = i + w) {
			List<Integer> celcium = new ArrayList<>();
			celcium.add(i);
			int far = ((i - 32) * 5) / 9;
			celcium.add(far);
			answer.add(celcium);
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> ans = fahrenheitToCelsius(0, 100, 20);
		System.out.println(ans);
	}

}
