package com.sparsh.algo.arrays;

/*
 Given an array of non-negative integers, you are initially positioned at the first index of the array.

 Each element in the array represents your maximum jump length at that position.

 Your goal is to reach the last index in the minimum number of jumps.

 For example:
 Given array A = [2,3,1,1,4]

 The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)
 */

public class JumpGameII {
	public int jump(int[] A) {
		if (A.length <= 1)
			return 0;
		int maxReach = A[0];
		int step = A[0];
		int jump = 1;
		for (int i = 1; i < A.length; i++) {
			if (i == A.length - 1)
				return jump;
			if (i + A[i] > maxReach)
				maxReach = i + A[i];
			step--;
			if (step == 0) {
				jump++;
				step = maxReach - i;
			}
		}
		return jump;
	}
}
