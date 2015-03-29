package com.sparsh.algo.linkedlist;

public class InsertIntoSortedList {
	public static ListNode insert(ListNode head, int num){
		ListNode n = new ListNode(num);
		ListNode iter = head;
		if(iter == null) return n;
		if(iter.val>num) {
			n.next = iter;
			return n;
		}
		while(iter.next!=null && iter.next.val<num){
			iter = iter.next;
		}
		n.next = iter.next;
		iter.next = n;
		return head;
	}
}
