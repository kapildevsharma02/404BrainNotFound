package com.practice.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class FindTheNearestSupporter {

	public static ArrayList<Integer> prevSmall(ArrayList<Integer> arr, int n) {
		// Write Your Code Here.
		ArrayList<Integer> ans = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		ans.add(-1);
		stack.push(arr.get(0));

		for (int i = 1; i < arr.size(); i++) {
			int current = arr.get(i);
			while (!stack.isEmpty() && stack.peek() >= current) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				stack.push(current);
				ans.add(-1);
			} else {
				ans.add(stack.peek());
				stack.push(current);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		ArrayList<Integer> ans = prevSmall(new ArrayList<>(Arrays.asList(3, 1, 5, 12, 10)), 5);
		System.out.println(ans);
	}

}
