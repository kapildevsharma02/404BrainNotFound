package com.practice.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Design a data structure to implement a stack, using only deque (double-ended queue). It should support the following operations :

push(X): Pushes an element X into the stack. Returns true if the element is pushed into the stack, otherwise false.

pop(): Pops the top element from the stack. Returns -1 if the stack is empty, otherwise, returns the popped element.

top(): Returns the topmost element of the stack. In case the stack is empty, it returns -1.

isEmpty() : Returns true if the stack is empty, otherwise false.

size(): Returns the number of elements currently present in the stack.
 * 
 */
public class StackUsingDeque {
	Deque<Integer> queue;

	StackUsingDeque() {
		queue = new ArrayDeque<>();
	}

	// Pushes 'X' into the stack. Returns true if it gets pushed into the stack, and
	// false otherwise.
	public boolean push(int x) {
		// Write your code here.
		queue.addFirst(x);
		return true;
	}

	// Pops top element from Stack. Returns -1 if the stack is empty, otherwise
	// returns the popped element.
	public int pop() {
		// Write your code here.
		if (queue.isEmpty()) {
			return -1;
		}
		return queue.removeFirst();
	}

	// Returns the topmost element of the stack. In case the stack is empty, it
	// returns -1.
	public int top() {
		// Write your code here.
		if (queue.isEmpty()) {
			return -1;
		}
		return queue.peek();
	}

	// Returns true if the stack is empty, otherwise false.
	public boolean isEmpty() {
		// Write your code here.
		return queue.isEmpty();
	}

	// Returns the number of elements currently present in the stack.
	public int size() {
		// Write your code here.
		return queue.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Question!!!!");
	}

}
