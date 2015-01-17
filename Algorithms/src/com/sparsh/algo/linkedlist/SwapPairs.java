package com.sparsh.algo.linkedlist;

/*
 * Given a linked list, swap every two adjacent nodes and return its head.
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * Your algorithm should use only constant space. 
 * You may not modify the values in the list, only nodes itself can be changed.
 */

public class SwapPairs {
	public ListNode swapPairs(ListNode head) {
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		ListNode next = head.next.next;
		ListNode n2 = head.next;
		ListNode n1 = head;
		n2.next = n1;
		n1.next = swapPairs(next);
		return n2;
	}
}
