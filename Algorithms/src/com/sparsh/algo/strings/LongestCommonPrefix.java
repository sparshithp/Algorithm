package com.sparsh.algo.strings;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 */

public class LongestCommonPrefix {

	/*
	 * This is a simple problem. We can just check for each position of every
	 * string in the string array. But we need to take care of some strings that
	 * is shorter than others.
	 */

	public String longestCommonPrefix(String[] str) {
		if (str.length == 0)
			return new String("");
		if (str.length == 1)
			return str[0];
		StringBuilder prefix = new StringBuilder();
		char c = 0;
		outer: for (int p = 0; p < str[0].length(); p++) {
			for (int i = 0; i < str.length; i++) {
				if (p == str[i].length())
					break outer;
				if (i == 0) {
					c = str[i].charAt(p);
				} else {
					if (str[i].charAt(p) != c)
						break outer;
					if (i == str.length - 1)
						prefix.append(c);
				}
			}
		}
		return prefix.toString();
	}

}
