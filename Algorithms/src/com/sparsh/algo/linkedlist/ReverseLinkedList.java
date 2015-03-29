package com.sparsh.algo.linkedlist;

public class ReverseLinkedList {
	public static ListNode reverse(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode orig = head;
		while (orig.next != null) {
			ListNode p = orig.next;
			orig.next = orig.next.next;
			p.next = head;
			head = p;
		}
		return head;
	}

	public static ListNode reverseRecursive(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode next = head.next;
		ListNode rev = reverseRecursive(next);
		next.next = head;
		head.next = null;
		
		return rev;
	}
}
