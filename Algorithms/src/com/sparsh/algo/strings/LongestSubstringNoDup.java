package com.sparsh.algo.strings;

/*
 * Given a string, find the length of the longest substring without repeating characters. 
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. 
 * For "bbbbb" the longest substring is "b", with the length of 1.
 */

public class LongestSubstringNoDup {

	public int lengthOfLongestSubstringNoDup(String s) {
		Boolean[] exist = new Boolean[256];
		for (int i = 0; i < 256; i++) {
			exist[i] = false;
		}
		int i = 0;
		int j = 0;
		int n = s.length();
		int maxlen = 0;
		while (j < n) {
			if (exist[s.charAt(j)]) {
				maxlen = Math.max(maxlen, j - i);
				while (s.charAt(i) != s.charAt(j)) {
					exist[s.charAt(i)] = false;
					i++;
				}
				i++;
				j++;
			} else {
				exist[s.charAt(j)] = true;
				j++;
			}

		}
		return maxlen = Math.max(maxlen, n - i);
	}

}
