package com.sparsh.algo.linkedlist;

/*
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 */

public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		return addTwoNumbersHelper(l1, l2, 0);
	}

	private ListNode addTwoNumbersHelper(ListNode l1, ListNode l2, int carry) {
		if (l1 == null && l2 == null && carry == 0)
			return null;
		int sum = 0;
		if (l1 != null) {
			sum += l1.val;
			l1 = l1.next;
		}
		if (l2 != null) {
			sum += l2.val;
			l2 = l2.next;
		}
		if (carry != 0) {
			sum++;
		}
		ListNode n = new ListNode(sum % 10);
		carry = sum > 9 ? 1 : 0;
		n.next = addTwoNumbersHelper(l1, l2, carry);
		return n;
	}
}
