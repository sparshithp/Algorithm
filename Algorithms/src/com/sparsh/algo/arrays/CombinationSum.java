package com.sparsh.algo.arrays;

/*
 Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
 The same repeated number may be chosen from C unlimited number of times.

 Note:
 All numbers (including target) will be positive integers.
 Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
 The solution set must not contain duplicate combinations.
 For example, given candidate set 2,3,6,7 and target 7, 
 A solution set is: 
 [7] 
 [2, 2, 3]  
 */
import java.util.*;

public class CombinationSum {

	public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates,
			int target) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if (candidates == null || candidates.length == 0)
			return res;
		Arrays.sort(candidates);
		helper(candidates, 0, target, new ArrayList<Integer>(), res);
		return res;
	}

	private void helper(int[] candidates, int start, int target,
			ArrayList<Integer> item, ArrayList<ArrayList<Integer>> res) {
		if (target < 0)
			return;
		if (target == 0) {
			res.add(new ArrayList<Integer>(item));
			return;
		}
		for (int i = start; i < candidates.length; i++) {
			if (i > 0 && candidates[i] == candidates[i - 1])
				continue;
			item.add(candidates[i]);
			helper(candidates, i, target - candidates[i], item, res);
			item.remove(item.size() - 1);
		}
	}

}
