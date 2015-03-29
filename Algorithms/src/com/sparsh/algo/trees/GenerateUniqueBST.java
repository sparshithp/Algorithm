package com.sparsh.algo.trees;

import java.util.ArrayList;
import java.util.List;

public class GenerateUniqueBST {
	public List<TreeNode> generateTrees(int n) {
		List<TreeNode> result = new ArrayList<TreeNode>();
		return generateTrees(1, n);
	}

	private List<TreeNode> generateTrees(int start, int end) {
		List<TreeNode> list = new ArrayList<TreeNode>();
		if (start > end) {
			list.add(null);
			return list;
		}
		for (int i = start; i <= end; i++) {
			List<TreeNode> lefts = generateTrees(start, i - 1);
			List<TreeNode> rights = generateTrees(i + 1, end);
			for (TreeNode left : lefts) {
				for (TreeNode right : rights) {
					TreeNode n = new TreeNode(i);
					n.left = left;
					n.right = right;
					list.add(n);
				}
			}
			
		}
		return list;
	}
}
