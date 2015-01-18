package com.sparsh.algo.arrays;

/*
 Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

 For example, 
 Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.

 */

public class TrappedWater {

	/*
	 * To find the trapped water at position i, we need to find the maximum
	 * value of the left elements of i and right elements of i. Assuming they
	 * are maxLeft[i] and maxRight[i]. The trapped water is min(maxLeft[i],
	 * maxRight[i]) – A[i] (if this value is larger than 0).
	 * 
	 * To find maxLeft and maxRight, we need to scan the array from left to
	 * right and from right to left. You can check the details in the code
	 * below.
	 * 
	 * Complexity
	 * 
	 * We only scan the array 3 times. So the complexity is O(n).
	 */

	public int trap(int[] A) {
		if (A.length == 0)
			return 0;
		int[] maxLeft = new int[A.length];
		int[] maxRight = new int[A.length];
		int max = A[0];
		for (int i = 1; i < A.length; i++) {
			maxLeft[i] = max;
			if (A[i] > max)
				max = A[i];
		}
		max = A[A.length - 1];
		for (int i = A.length - 2; i >= 0; i--) {
			maxRight[i] = max;
			if (A[i] > max)
				max = A[i];
		}
		int ret = 0;
		for (int i = 1; i < A.length - 1; i++) {
			int trap = Math.min(maxLeft[i], maxRight[i]) - A[i];
			if (trap > 0)
				ret += trap;
		}
		return ret;
	}

}
