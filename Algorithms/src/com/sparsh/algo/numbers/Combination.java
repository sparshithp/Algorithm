package com.sparsh.algo.numbers;

/*
 Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 For example,
 If n = 4 and k = 2, a solution is:
 [
 [2,4],
 [3,4],
 [2,3],
 [1,2],
 [1,3],
 [1,4],
 ]
 */

import java.util.*;

public class Combination {
	public List<ArrayList<Integer>> combine(int n, int k) {
		List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		List<Integer> comb = new ArrayList<Integer>();
		combineHelper(1, k, 0, n, comb, result);
		return result;
	}

	private void combineHelper(int start, int k, int index, int n,
			List<Integer> comb, List<ArrayList<Integer>> result) {
		if (index == k) {
			result.add(new ArrayList<Integer>(comb));
			return;
		}
		for (int i = start; i <= n; i++) {
			comb.add(i);
			combineHelper(i + 1, k, index + 1, n, comb, result);
			comb.remove(comb.size() - 1);
		}
	}
}
