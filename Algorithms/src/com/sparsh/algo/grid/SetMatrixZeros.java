package com.sparsh.algo.grid;

/*
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 */

public class SetMatrixZeros {
	
	/*
	 * If we set zeros in the first pass, information will be lost
	 * So we maintain two arrays for rows and columns and mark that particular row and column
	 * In the second pass, we get around to updating the matrix with zeros. 
	 */
	public void setZeroes(int[][] matrix) {
		boolean[] rows = new boolean[matrix.length];
		boolean[] col = new boolean[matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					rows[i] = true;
					col[j] = true;
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (rows[i] || col[j]) {
					matrix[i][j] = 0;
				}
			}
		}

	}
}
