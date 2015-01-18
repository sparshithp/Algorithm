package com.sparsh.algo.arrays;

/*
 Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

 For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 */

public class MaxSubArray {

	public int maxSubArray(int[] A) {
		if (A.length == 0)
			return 0;
		int max = A[0];
		int newSum = A[0];
		for (int i = 1; i < A.length; i++) {
			newSum = Math.max(A[i], newSum + A[i]);
			max = Math.max(newSum, max);
		}
		return max;
	}

}
