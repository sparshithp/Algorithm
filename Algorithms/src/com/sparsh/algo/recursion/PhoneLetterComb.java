package com.sparsh.algo.recursion;

/*
 * Given a digit string, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */

import java.util.ArrayList;
import java.util.List;

public class PhoneLetterComb {

	public List<String> letterCombinations(String digits) { 
        List<String> res = new ArrayList<String>(); 
        if(digits.length()==0){ 
            res.add(""); 
            return res; 
        } 
        StringBuilder sb = new StringBuilder(); 
        dfs(res,digits,sb); 
        
        return res; 
    } 
     
    private String[] numMap = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; 
    
    private void dfs(List<String> res, String digits,StringBuilder sb){ 
        if(digits.length()==0){ 
            res.add(sb.toString()); 
            return; 
        } 
        int curDigit =digits.charAt(0)-'0'; 
        String curStr = numMap[curDigit]; 
        
        for(int i=0;i<curStr.length();i++){ 
            sb.append(curStr.charAt(i)); 
            dfs(res,digits.substring(1),sb); 
            sb.deleteCharAt(sb.length()-1); 
        } 
        
        
    } 
	
}
