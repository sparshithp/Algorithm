package com.sparsh.algo.strings;

/*
 Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 For example, 
 Given s = "Hello World",
 return 5.
 */

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
		int ind = s.length() - 1;
		if (ind < 0)
			return 0;
		int len = 0;
		while (ind >= 0 && s.charAt(ind) == ' ') {
			ind--;
		}
		while (ind >= 0 && s.charAt(ind) != ' ') {
			len++;
			ind--;
		}
		return len;
	}
}
