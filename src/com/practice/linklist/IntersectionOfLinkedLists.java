package com.practice.linklist;

/*
 * https://www.naukri.com/
 * code360/problems/intersection-of-linked-lists_3210610?
 * interviewProblemRedirection=true&search=intersection&attempt_status=COMPLETED
 */
import com.practice.node.Node;

public class IntersectionOfLinkedLists {
	public static Node intersect_ll(Node L1, Node L2) {

		// Write your Code here
		int flag = 0;
		Node temp1 = L1;
		Node temp2 = L2;
		Node answer = new Node(-1);
		Node finalAnswer = answer;
		while (temp1 != null && temp2 != null) {
			if (temp1.data == temp2.data && flag == 0) {
				answer.data = temp1.data;
				flag = 1;
				temp1 = temp1.next;
				temp2 = temp2.next;
			} else if (temp1.data == temp2.data && flag == 1) {
				answer.next = new Node(temp1.data);
				answer = answer.next;
				temp1 = temp1.next;
				temp2 = temp2.next;
			} else if (temp1.data < temp2.data) {
				temp1 = temp1.next;
			} else if (temp1.data > temp2.data) {
				temp2 = temp2.next;
			}
		}
		if (finalAnswer.data == -1) {
			return finalAnswer.next;
		}
		return finalAnswer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// proper two link list should be passed like
		// l1->1 2 3 4 -1
		// l2->2 3 4 5 -1
		intersect_ll(new Node(1), new Node(2));
	}

}
