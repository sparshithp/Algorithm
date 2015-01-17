package com.sparsh.algo.arrays;

public class InsertPosition {
	
	/*
	 * Find insert position in sorted array
	 */
	public int searchInsert(int[] A, int target) {
		int len = A.length;
		if (len == 0)
			return 0;
		if (A[0] > target)
			return 0;
		if (A[len - 1] < target)
			return len;
		int start = 0;
		int end = len - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (A[mid] == target)
				return mid;
			if (A[mid] > target && A[mid - 1] < target)
				return mid;
			if (A[mid] < target)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return 0;
	}
}
