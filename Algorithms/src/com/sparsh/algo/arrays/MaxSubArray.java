package com.sparsh.algo.arrays;

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
