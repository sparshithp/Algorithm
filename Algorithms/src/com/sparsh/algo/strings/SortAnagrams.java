package com.sparsh.algo.strings;

import java.util.*;

public class SortAnagrams {
	public List<String> anagrams(String[] strs) { 
        List<String> result = new ArrayList<String>(); 
        if (strs==null||strs.length==0){ 
           return result; 
        } 
        HashMap<String,List<String>> map = new HashMap<String,List<String>>(); 
        for(int i=0; i<strs.length; i++){ 
            char[] temp= strs[i].toCharArray(); 
            Arrays.sort(temp); 
            String s = new String(temp); 
            if(!map.containsKey(s)){ 
                List<String> list = new ArrayList<String>(); 
                list.add(strs[i]); 
                map.put(s, list); 
            }else{ 
                map.get(s).add(strs[i]); 
            } 
        } 
        
        for(List<String> list : map.values()){ 
            if(list.size()>1) 
            for(String s: list){ 
                result.add(s); 
            } 
        } 
        return result; 
    } 
}
