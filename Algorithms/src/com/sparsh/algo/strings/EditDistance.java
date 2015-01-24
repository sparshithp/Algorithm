package com.sparsh.algo.strings;

public class EditDistance {
	public static int minDistance(String word1, String word2) {
		int[][] dist = new int[word1.length() + 1][word2.length() + 1];
		for (int i = 0; i <= word1.length(); i++) {
			dist[i][0] = i;
		}
		for (int j = 0; j <= word2.length(); j++) {
			dist[0][j] = j;
		}
		for (int i = 0; i < word1.length(); i++) {
			for (int j = 0; j < word2.length(); j++) {
				if (word1.charAt(i) == word2.charAt(j)) {
					dist[i + 1][j + 1] = dist[i][j];
				} else {
					int replace = dist[i][j] + 1;
					int insert = dist[i][j + 1] + 1;
					int remove = dist[i + 1][j] + 1;
					int min = Math.min(insert, remove);
					min = Math.min(min, replace);
					dist[i + 1][j + 1] = min;
				}
			}
		}

		return dist[word1.length()][word2.length()];
	}
}
