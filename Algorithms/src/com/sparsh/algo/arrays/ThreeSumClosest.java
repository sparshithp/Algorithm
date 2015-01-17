package com.sparsh.algo.arrays;

/*
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
 *  Return the sum of the three integers. 
 * You may assume that each input would have exactly one solution.
 */
import java.util.Arrays;

public class ThreeSumClosest {
	
	public int threeSumClosest(int[] num, int target) {
		int closest = Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		Arrays.sort(num);
		for (int i = 0; i < num.length - 2; i++) {
			int start = i + 1;
			int end = num.length - 1;
			int rem = target - num[i];
			while (start < end) {
				int diff = rem - num[start] - num[end];
				int sum = num[i] + num[start] + num[end];
				if (diff == 0) {
					return sum;
				}
				if (Math.abs(diff) < min) {
					min = Math.abs(diff);
					closest = sum;
				}
				if (diff > 0)
					start++;
				else
					end--;

			}
		}
		return closest;
	}
}
