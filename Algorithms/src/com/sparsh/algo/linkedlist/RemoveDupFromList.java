package com.sparsh.algo.linkedlist;

/*
 Given a sorted linked list, delete all duplicates such that each element appear only once.

 For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3
 */

public class RemoveDupFromList {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode curr = head.next;
		ListNode prev = head;
		while (curr != null) {
			if (curr.val != prev.val) {
				prev.next = curr;
				prev = curr;
			} else {
				prev.next = curr.next;
			}
			curr = curr.next;
		}

		return head;
	}
}
