package com.sparsh.algo.strings;

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
