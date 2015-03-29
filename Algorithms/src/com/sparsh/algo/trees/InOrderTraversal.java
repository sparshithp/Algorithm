package com.sparsh.algo.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
		TreeNode next = root;
		List<Integer> result = new ArrayList<Integer>();
		if (root == null)
			return result;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (!stack.isEmpty() || next != null) {
			if (next != null) {
				stack.push(next);
				next = next.left;
			} else {
				next = stack.pop();
				result.add(next.val);
				next = next.right;
			}
		}
		return result;
	}

}
