package com.practice.linklist;

import com.practice.node.Node;

/*
 * Problem statement
You are given a Singly Linked List of ‘N’ positive integers. 
Your task is to add a node having the value ‘VAL’ 
at position ‘POS’ in the linked list.

Note:
Assume that the Indexing for the linked list starts from 0.
EXAMPLE:
Input: ‘N’ = 5, 'LIST' = [1, 1, 2, 3, 4, -1], ‘VAL’ = 2, ‘POS’ = 1.

Output: 1 -> 2 -> 1 -> 2 -> 3 -> 4 

Here in the given list we can see that the node having value 2 is inserted at position 1.

 */
public class InsertionInASinglyLinkedList {

	public static Node insert(Node head, int n, int pos, int val) {
		// Write your code here.
		if (pos == 0) {
			Node temp = new Node(val);
			temp.next = head;
			head = temp;
			return head;
		}
		Node first = head;
		Node prev = null;
		while (pos != 0) {
			prev = first;
			first = first.next;
			--pos;
		}
		Node temp = new Node(val);
		temp.next = first;
		prev.next = temp;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node answer = insert(new Node(1), 4, 1, 2);
	}

}
