package com.sparsh.algo.arrays;

public class IndexRange {
	
	    public int[] searchRange(int[] A, int target) {  
	        if (A==null) return null; 
	       
	        int[] result={-1,-1}; 
	      
	        int low=binarySearch(A,target-0.5); 
	        
	        
	        // Be care for there , low>=A.length must be check first or 
	        // there may be a out of boundary exception cause 
	        // the binarySearch function in this question return low instead of null 
	        // if the target are not in the array 
	        
	        if (low>=A.length||A[low]!=target){ 
	            return result; 
	            
	        } 
	       
	        
	        result[0]=low; 
	        result[1]=binarySearch(A,target+0.5)-1; 
	        
	        return result; 
	           
	    } 
	    public int binarySearch(int[] A, double t){ 
	        int low = 0, high = A.length - 1; 
	        while(low <= high){ 
	            int m = (low + high) / 2; 
	            if(A[m] == t) return m; 
	            if(A[m] > t) high = m - 1; 
	            else low = m + 1; 
	        } 
	        return low; 
	    }
	
}
