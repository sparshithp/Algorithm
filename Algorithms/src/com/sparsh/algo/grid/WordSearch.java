package com.sparsh.algo.grid;

/*
 Given a 2D board and a word, find if the word exists in the grid.

 The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

 For example,
 Given board =

 [
 ["ABCE"],
 ["SFCS"],
 ["ADEE"]
 ]
 word = "ABCCED", -> returns true,
 word = "SEE", -> returns true,
 word = "ABCB", -> returns false.
 */

public class WordSearch {
	// GLobal grid to keep track of visited nodes
	boolean[][] visited;

	public boolean exist(char[][] board, String word) {
		visited = new boolean[board.length][board[0].length];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0)) {
					if (search(board, word, 0, i, j)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private boolean search(char[][] board, String word, int n, int i, int j) {
		if (n == word.length())
			return true;
		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length)
			return false;
		if (visited[i][j]) {
			return false;
		}
		if (board[i][j] != word.charAt(n)) {
			return false;
		}
		visited[i][j] = true;
		boolean result = search(board, word, n + 1, i - 1, j)
				|| search(board, word, n + 1, i + 1, j)
				|| search(board, word, n + 1, i, j - 1)
				|| search(board, word, n + 1, i, j + 1);
		visited[i][j] = false;
		return result;
	}

}
