package com.sparsh.algo.linkedlist;

/*
 * Merge k sorted linked lists and return it as one sorted list.
 *  Analyze and describe its complexity.
 */

import java.util.List;

public class MergeKLists {

	/*
	 * Naive solution is to get the smallest element in all the lists and then
	 * repeat it by merging. But a better solution would be try like a mergesort
	 * where we merge list 1 and 2 into a list say 5 and list 3 and 4 into 6 ...
	 * then we merge 5 & 6 again.
	 */
	public ListNode mergeKLists(List<ListNode> lists) {
		if (lists.size() == 0)
			return null;
		return mergeKLists(lists, 0, lists.size() - 1);
	}

	private ListNode mergeKLists(List<ListNode> lists, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			return merge(mergeKLists(lists, left, mid),
					mergeKLists(lists, mid + 1, right));
		}
		return lists.get(left);
	}

	private ListNode merge(ListNode m, ListNode n) {
		ListNode head = new ListNode(0);
		ListNode p = head;
		while (m != null && n != null) {
			if (m.val < n.val) {
				p.next = m;
				p = p.next;
				m = m.next;
			} else {
				p.next = n;
				p = p.next;
				n = n.next;
			}
		}
		if (m != null)
			p.next = m;
		else
			p.next = n;
		return head.next;
	}

}
