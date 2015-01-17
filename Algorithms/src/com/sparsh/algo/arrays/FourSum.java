package com.sparsh.algo.arrays;

/*
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? 
 * Find all unique quadruplets in the array which gives the sum of target.
 * Note:Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
 * The solution set must not contain duplicate quadruplets.
 */

import java.util.*;

public class FourSum {

	public List<List<Integer>> fourSum(int[] num, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(num);
		for (int i = 0; i < num.length - 3; i++) {
			if (i == 0 || num[i] != num[i - 1]) {
				for (int j = i + 1; j < num.length - 2; j++) {
					if (j == i + 1 || num[j] != num[j - 1]) {
						int rem = target - num[i] - num[j];
						int start = j + 1;
						int end = num.length - 1;
						while (start < end) {
							if (num[start] + num[end] == rem) {
								List<Integer> quad = new ArrayList<Integer>();
								quad.add(num[i]);
								quad.add(num[j]);
								quad.add(num[start]);
								quad.add(num[end]);
								list.add(quad);
								start++;
								end--;
								while (start < end
										&& num[start] == num[start - 1])
									start++;
								while (start < end && num[end] == num[end + 1])
									end--;
							} else if (num[start] + num[end] > rem)
								end--;
							else
								start++;

						}
					}
				}
			}
		}
		return list;
	}

}
