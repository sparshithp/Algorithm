package com.sparsh.algo.stacks;

/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesis {

	public boolean isValid(String s) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (map.containsKey(a)) {
				st.push(a);
			} else {
				if (st.empty())
					return false;
				char b = st.pop();
				if (!(map.get(b) == a))
					return false;
			}
		}
		return st.empty();
	}

}
