package com.sparsh.algo.strings;

/*
 * Given a string S, find the longest palindromic substring in S.
 * You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 */

public class PalindromicSubString {

	public String longestPalindrome(String s) {
		int len = s.length();
		int start = 0;
		int max = 1;
		for (int i = 1; i < len; i++) {
			int low = i - 1;
			int high = i + 1;
			int count = 1;
			for (int j = 0; low - j >= 0 && high + j < len; j++) {
				if (s.charAt(low - j) == s.charAt(high + j)) {
					count += 2;
					if (max < count) {
						start = low - j;
						max = count;
					}
				} else
					break;
			}
		}

		for (int i = 1; i < len; i++) {
			int low = i - 1;
			int high = i;
			int count = 0;
			for (int j = 0; low - j >= 0 && high + j < len; j++) {
				if (s.charAt(low - j) == s.charAt(high + j)) {
					count += 2;
					if (max < count) {
						start = low - j;
						max = count;
					}
				} else
					break;
			}
		}

		return s.substring(start, start + max);
	}
}
