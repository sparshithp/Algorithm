package com.sparsh.algo.recursion;

/*
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * For example, given n = 3, a solution set is:
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 */

import java.util.ArrayList;
import java.util.List;

public class GenParanthesis {

	public List<String> generateParenthesis(int n) { 
	      List<String> list = new ArrayList<String>(); 
	      char[] str = new char[2*n]; 
	      genPar(list, n, n, str, 0 ); 
	      return list; 
	    } 
	    public void genPar(List<String> list, int leftRem, int rightRem, char[] str, int count){ 
	        if(leftRem>rightRem || leftRem<0) return; 
	        if(leftRem==0 && rightRem==0) { 
	            String s=String.copyValueOf(str); 
	            list.add(s); 
	            return; 
	        } 
	        if(leftRem!=0){ 
	            str[count]='('; 
	            genPar(list, leftRem-1,rightRem, str, count+1); 
	        } 
	        if(rightRem!=0 && rightRem>leftRem){ 
	            str[count]=')'; 
	            genPar(list, leftRem,rightRem-1, str, count+1); 
	        } 

	    } 
	
}
