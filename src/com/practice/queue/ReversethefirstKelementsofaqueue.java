package com.practice.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReversethefirstKelementsofaqueue {

	public static void reverse(Queue<Integer> queue, int k) {
		// Write your code here.
		List<Integer> reverseQueue = new ArrayList<>();
		for (int a : queue) {
			reverseQueue.add(a);
		}
		
		int i = 0;
		int j = k - 1;
		swap(i, j, reverseQueue);

		while (!queue.isEmpty()) {
			queue.remove();
		}
		for (int a : reverseQueue) {
			queue.add(a);
		}
	}

	private static void swap(int i, int j, List<Integer> reverseQueue) {
		// TODO Auto-generated method stub
		while (i < j) {
			int temp = reverseQueue.get(i);
			reverseQueue.set(i, reverseQueue.get(j));
			reverseQueue.set(j, temp);
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q1 = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
		reverse(q1, 5);
		System.out.println(q1);
	}
}

