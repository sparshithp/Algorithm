package com.sparsh.algo.linkedlist;

/*
 Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

 For example,
 Given 1->2->3->3->4->4->5, return 1->2->5.
 Given 1->1->1->2->3, return 2->3.
 */
public class RemoveNonUniqueSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode preHead = new ListNode(0);
		preHead.next = head;
		ListNode prev = preHead;
		while (head != null) {
			if (head.next == null)
				break;
			if (head.val == head.next.val) {
				while (head.next != null && head.next.val == head.val) {
					head = head.next;
				}
				head = head.next;
				prev.next = head;
			} else {
				head = head.next;
				prev = prev.next;
			}

		}
		return preHead.next;
	}
}
