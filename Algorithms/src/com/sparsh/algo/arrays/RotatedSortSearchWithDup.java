package com.sparsh.algo.arrays;

/*
 Follow up for "Search in Rotated Sorted Array":
 What if duplicates are allowed?

 Would this affect the run-time complexity? How and why?

 Write a function to determine if a given target is in the array.

 {1,3,5,1,1,1,1}
 */

public class RotatedSortSearchWithDup {
	public boolean search(int[] A, int target) {
		if (A == null || A.length == 0) {
			return false;
		}
		return searchHelper(A, 0, A.length - 1, target);
	}

	private boolean searchHelper(int[] a, int i, int j, int target) {
		if (i > j)
			return false;
		int mid = i + (j - i) / 2;
		if (a[mid] == target)
			return true;
		if (a[i] < a[mid]) {
			if (target >= a[i] && target < a[mid]) {
				return searchHelper(a, i, mid - 1, target);
			} else {
				return searchHelper(a, mid + 1, j, target);
			}
		} else if (a[i] > a[mid]) {
			if (target > a[mid] && target <= a[j]) {
				return searchHelper(a, mid + 1, j, target);
			} else {
				return searchHelper(a, i, mid - 1, target);
			}
		} else {
			if (a[mid] != a[j]) {
				return searchHelper(a, mid + 1, j, target);
			} else {
				return searchHelper(a, i, mid - 1, target)
						|| searchHelper(a, mid + 1, j, target);
			}
		}
	}
}
