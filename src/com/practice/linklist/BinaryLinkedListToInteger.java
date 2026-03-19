package com.practice.linklist;

import com.practice.node.Node;

/*
 * You are given a singly linked list containing ‘n’ nodes,
 *  where every node in the linked list contains a pointer “next” 
 *  which points to the next node in the list and having values either 0 or 1. 
 *  Your task is to return the decimal 
 *  representation of the given number in the linked list.

For Example:
n = 4, list: 1 -> 0 -> 1 -> 0.

Now in this example, the value in the linked list is 1010, which is 10 in Decimal.
Hence the answer is 10.
 * */
public class BinaryLinkedListToInteger {

	public static int binaryToInteger(int n, Node head) {
		// Write your code here.
		Node temp = head;
		int number = 0;
		while (temp != null) {
			n--;
			if (temp.data == 1) {
				number += Math.pow(2, n);
			}
			temp = temp.next;
		}
		return number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		int answer = binaryToInteger(4, head);
		System.out.println(answer);
	}

}
