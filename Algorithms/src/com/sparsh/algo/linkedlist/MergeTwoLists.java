package com.sparsh.algo.linkedlist;

/*
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 */

public class MergeTwoLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode merged = null;
		ListNode head = null;
		while (l1 != null && l2 != null) {
			ListNode n;
			if (l1.val < l2.val) {
				n = l1;
				l1 = l1.next;
			} else {
				n = l2;
				l2 = l2.next;
			}
			n.next = null;
			if (merged == null) {
				merged = n;
				head = n;
			} else {
				merged.next = n;
				merged = merged.next;
			}
		}
		if (l1 != null && merged != null) {
			merged.next = l1;
		}
		if (l2 != null && merged != null) {
			merged.next = l2;
		}
		return head;
	}

}
