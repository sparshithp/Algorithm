package com.sparsh.algo.strings;

import java.util.HashMap;

/*
 * Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

 For example,
 S = "ADOBECODEBANC"
 T = "ABC"
 Minimum window is "BANC".

 Note:
 If there is no such window in S that covers all characters in T, return the emtpy string "".

 If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in S.
 */

public class MinimumWindowSubstring {

	public String minWindow(String S, String T) {
		// take a count of each character in T to a HashMap
		HashMap<Character, Integer> dict = new HashMap<Character, Integer>();
		for (int i = 0; i < T.length(); i++) {
			char c = T.charAt(i);
			if (dict.containsKey(c)) {
				dict.put(c, dict.get(c) + 1);
			} else {
				dict.put(c, 1);
			}
		}
		// Create HashMap to keep track of count of characters found
		HashMap<Character, Integer> foundMap = new HashMap<Character, Integer>();

		// Maintain two pointers and iterate through the array keep count of the
		// characters of T found till now
		int min = Integer.MAX_VALUE;
		String minWindow = "";
		int start = 0;
		int end = 0;
		int foundCount = 0;
		while (end < S.length()) {
			char c = S.charAt(end);
			if (dict.containsKey(c)) {
				if (foundMap.containsKey(c)) {
					if (foundMap.get(c) < dict.get(c)) {
						foundCount++;
					}
					foundMap.put(c, foundMap.get(c) + 1);
				} else {
					foundMap.put(c, 1);
					foundCount++;
				}
			}
			if (foundCount == T.length()) {
				char a = S.charAt(start);
				while (!foundMap.containsKey(a)
						|| foundMap.get(a) > dict.get(a)) {
					if (foundMap.containsKey(a)
							&& foundMap.get(a) > dict.get(a))
						foundMap.put(a, foundMap.get(a) - 1);
					a = S.charAt(++start);
				}
				if (min > end - start + 1) {
					min = end - start + 1;
					minWindow = S.substring(start, end + 1);
				}

			}
			end++;
		}
		return minWindow;

	}
}
