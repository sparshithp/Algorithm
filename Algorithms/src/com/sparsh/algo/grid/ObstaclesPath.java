package com.sparsh.algo.grid;

/*
 * Find number of unique paths between (0,0) and (m,n) with obstacles in between
 * You can only move right and down
 */

public class ObstaclesPath {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		int[][] matrix = new int[m][n];
		if (m < 0 || n < 0)
			return 0;
		boolean zeroCheck = false;
		for (int i = 0; i < m; i++) {
			if (zeroCheck == false && obstacleGrid[i][0] == 0) {
				matrix[i][0] = 1;
			} else {
				zeroCheck = true;
			}
		}
		zeroCheck = false;
		for (int i = 0; i < n; i++) {
			if (zeroCheck == false && obstacleGrid[0][i] == 0) {
				matrix[0][i] = 1;
			} else {
				zeroCheck = true;
			}
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (obstacleGrid[i][j] == 0) {
					matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
				}
			}
		}
		return matrix[m - 1][n - 1];
	}
}
