package com.practice.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class ReversingAQueue {

	public static Queue<Integer> reverseQueue(Queue<Integer> q) {
		// Write your code here.
		Queue<Integer> ans = new LinkedList<>();
		Stack<Integer> s = new Stack<>();
		while (!q.isEmpty()) {
			s.add(q.poll());
		}
		while (!s.isEmpty()) {
			q.add(s.pop());
		}
		return q;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> ans = new LinkedList(Arrays.asList(10, 6, 8, 12, 3));
		Queue<Integer> answer = reverseQueue(ans);
		System.out.println(answer);
	}
}