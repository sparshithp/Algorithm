package com.sparsh.algo.grid;

/*
 Now consider if some obstacles are added to the grids. How many unique paths would there be?

 An obstacle and empty space is marked as 1 and 0 respectively in the grid.

 For example,
 There is one obstacle in the middle of a 3x3 grid as illustrated below.

 [
 [0,0,0],
 [0,1,0],
 [0,0,0]
 ]
 The total number of unique paths is 2.

 Note: m and n will be at most 100.
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
