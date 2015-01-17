package com.sparsh.algo.arrays;

public class SearchRotated {

	public int search(int[] A, int target) {
		int i = 0;
		int j = A.length - 1;
		while (i <= j) {
			int mid = (i + j) / 2;
			if (A[mid] == target)
				return mid;
			if (A[i] <= A[mid]) {
				if (A[i] <= target && A[mid] > target) {
					j = mid - 1;
				} else {
					i = mid + 1;
				}
			} else {
				if (A[mid] < target && A[j] >= target) {
					i = mid + 1;
				} else {
					j = mid - 1;
				}

			}
		}
		return -1;
	}
}
