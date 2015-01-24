package com.sparsh.algo.grid;

/*
 Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

 Integers in each row are sorted from left to right.
 The first integer of each row is greater than the last integer of the previous row.
 For example,

 Consider the following matrix:

 [
 [1,   3,  5,  7],
 [10, 11, 16, 20],
 [23, 30, 34, 50]
 ]

 Given target = 3, return true.
 */

public class Search2DMatrix {

	/*
	 * We start from the last element in the first row and if that element is
	 * greater than the target, we erform a binary search on that row only. If
	 * the target is greater than the element we go to a lower row.
	 */

	public boolean searchMatrix(int[][] matrix, int target) {
		int i = 0;
		int j = matrix[0].length - 1;
		while (i < matrix.length && j >= 0) {
			if (matrix[i][j] == target)
				return true;
			if (matrix[i][j] > target) {
				return binSearch(matrix[i], 0, j, target);
			} else {
				i++;
			}
		}
		return false;
	}

	private boolean binSearch(int[] arr, int i, int j, int target) {
		// TODO Auto-generated method stub
		while (i <= j) {
			int mid = (i + j) / 2;
			if (arr[mid] == target)
				return true;
			if (arr[mid] > target)
				j = mid - 1;
			else
				i = mid + 1;
		}
		return false;
	}
}
