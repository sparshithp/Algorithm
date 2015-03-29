package com.sparsh.algo.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if (root == null)
			return result;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode next = stack.pop();
			result.add(next.val);
			if (next.right != null)
				stack.push(next.right);
			if (next.left != null)
				stack.push(next.left);
		}
		return result;
	}
}
