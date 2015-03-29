package com.sparsh.algo.linkedlist;

public class KthNode {
	public static ListNode findKthNode(ListNode head, int k) {
		ListNode fast = head;
		ListNode slow = head;
		while (k > 1) {
			if (fast == null)
				return null;
			fast = fast.next;
			k--;
		}
		if (fast == null)
			return null;
		while (fast.next != null){
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
	}
}
