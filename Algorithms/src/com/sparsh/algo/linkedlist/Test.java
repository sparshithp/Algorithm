package com.sparsh.algo.linkedlist;

public class Test {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(5);
		ListNode n4 = new ListNode(7);
		ListNode n5 = new ListNode(9);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		System.out.println(KthNode.findKthNode(n1, 5).val);
		//display(ReverseLinkedList.reverseRecursive(n1));
		
	}
	
	public static void display(ListNode head){
		while(head != null){
			System.out.println(head.val);
			head = head.next;
		}
	}

}
