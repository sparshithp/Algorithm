package com.sparsh.algo.strings;

/*
 * Implement strStr().Returns the index of the first occurrence of needle in haystack,
 *  or -1 if needle is not part of haystack.
 */

public class NeedleHaystack {
	
	public int strStr(String haystack, String needle) { 
        if(needle.length()>haystack.length()) return -1; 
        if(needle.length()==0) return 0; 
        for(int i =0; i<=haystack.length()-needle.length();i++){ 
            if(haystack.charAt(i)==needle.charAt(0)){ 
                if(haystack.substring(i,i+needle.length()).equals(needle)) return i; 
            } 
        } 
        return -1; 
    } 
	
}
