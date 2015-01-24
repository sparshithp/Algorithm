package com.sparsh.algo.arrays;

/*
 Given a set of distinct integers, S, return all possible subsets.

 Note:
 Elements in a subset must be in non-descending order.
 The solution set must not contain duplicate subsets.
 For example,
 If S = [1,2,3], a solution is:

 [
 [3],
 [1],
 [2],
 [1,2,3],
 [1,3],
 [2,3],
 [1,2],
 []
 ]
 */

import java.util.ArrayList;
import java.util.Collections;

public class Subsets {
	public ArrayList<ArrayList<Integer>> subsets(int[] S) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		//Add and empty subset
		result.add(new ArrayList<Integer>());
		subsetHelper(S, 0, result);
		return result;
	}

	private void subsetHelper(int[] s, int i,
			ArrayList<ArrayList<Integer>> result) {
		if (i == s.length) {
			return;
		}
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		for (ArrayList<Integer> sub : result) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.addAll(sub);
			temp.add(s[i]);
			Collections.sort(temp);
			res.add(temp);
		}
		result.addAll(res);
		subsetHelper(s, i + 1, result);

	}
}
