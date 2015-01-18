package com.sparsh.algo.linkedlist;

/*
 Given a list, rotate the list to the right by k places, where k is non-negative.

 For example:
 Given 1->2->3->4->5->NULL and k = 2,
 return 4->5->1->2->3->NULL.
 */

public class RotateList {
	public ListNode rotateRight(ListNode head, int n) {
		if (head == null)
			return null;
		if (n == 0)
			return head;
		/* Calculate the length of the list first */
		ListNode iter = head;
		int len = 1;
		while (iter.next != null) {
			iter = iter.next;
			len++;
		}
		/* Link the last node to the head to create a cycle */
		iter.next = head;
		/* Be careful of the case where n is greater than the length */
		int k = len - n % len;
		ListNode last = iter;
		/* Get the last element after rotation */
		while (k > 0) {
			iter = iter.next;
			k--;
		}
		/* Break the cyle and get the head */
		head = iter.next;
		iter.next = null;
		return head;
	}
}
