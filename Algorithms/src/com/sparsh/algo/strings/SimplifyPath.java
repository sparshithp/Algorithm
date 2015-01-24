package com.sparsh.algo.strings;

/*
 Given an absolute path for a file (Unix-style), simplify it.
 For example,
 path = "/home/", => "/home"
 path = "/a/./b/../../c/", => "/c"s
 */
import java.util.Stack;

public class SimplifyPath {
	/*
	 * Split the string on '/' and everytime we encounter a '..', we pop from
	 * the stack else we push that string into the stack
	 */
	public String simplifyPath(String path) {
		StringBuilder sb = new StringBuilder();
		if (path == null || path.length() == 0) {
			return sb.toString();
		}
		Stack<String> st = new Stack<String>();
		String[] str = path.split("/");
		for (String s : str) {
			if (s.length() == 0 || s.equals("."))
				continue;
			if (s.equals("..")) {
				if (!st.isEmpty()) {
					st.pop();
				}
			} else {
				st.push(s);
			}
		}
		if (st.isEmpty()) {
			sb.append("/");
		}
		while (!st.isEmpty()) {
			sb.insert(0, st.pop());
			sb.insert(0, "/");
		}
		return sb.toString();
	}
}
