package com.sparsh.algo.arrays;

/*
Given an unsorted integer array, find the first missing positive integer.

For example,
Given [1,2,0] return 3,
and [3,4,-1,1] return 2.

Your algorithm should run in O(n) time and uses constant space.
 */


public class FirstMissingPositive {
	
	/*We are required to use constant space. So we need to use the array. We can put the element, which value is i, in position i – 1. After we finishing doing this, we can go through the array to find the first missing positive integer. 

	For example, the original array is 3 4 -1 1. We will make it like 1 4 3 -1. And we can know the missing number is 2 easily 
	*/ 

	
	public int firstMissingPositive(int[] A) { 
        int i = 0; 
        while (i < A.length) { 
            if (A[i] != i + 1 && A[i] >= 1 && A[i] <= A.length && A[A[i] - 1] != A[i]) { 
                int tmp = A[A[i] - 1]; 
                A[A[i] - 1] = A[i]; 
                A[i] = tmp; 
            } else 
                i++; 
        } 
        for (i = 0; i < A.length; i++) { 
            if (A[i] != i + 1) 
                return i + 1; 
        } 
        return A.length + 1; 
    } 
	
}
