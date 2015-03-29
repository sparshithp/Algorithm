package com.sparsh.algo.arrays;

/*
 Follow up for "Remove Duplicates":
 What if duplicates are allowed at most twice?

 For example,
 Given sorted array A = [1,1,1,2,2,3],

 Your function should return length = 5, and A is now [1,1,2,2,3].
 */

public class MaxTwoDuplicates {
	public int removeDuplicates(int[] A) {
		if (A.length == 0 || A == null)
			return 0;
		int currIndex = 1;
		int currNum = A[0];
		int count = 1;
		int i = 1;
		while (i < A.length) {
			if (A[i] == currNum) {
				if (count <= 1) {
					A[currIndex++] = A[i];
					count++;
				}
			}else{
				currNum = A[i];
				count =1;
				A[currIndex++] = A[i];
			}
			i++;
		}
		return currIndex;
	}
}
