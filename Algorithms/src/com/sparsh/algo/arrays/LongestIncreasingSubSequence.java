package com.sparsh.algo.arrays;

import java.util.Arrays;

/*
 * The longest Increasing Subsequence (LIS) problem is to find the length of the 
 * longest subsequence of a given sequence such that all elements of the subsequence are 
 * sorted in increasing order. For example, length of LIS for { 10, 22, 9, 33, 21, 50, 41, 60, 80 } is 6 
 * and LIS is {10, 22, 33, 50, 60, 80}.
 */

public class LongestIncreasingSubSequence {

	/*
	 * Let arr[0..n-1] be the input array and L(i) be the length of the LIS till
	 * index i such that arr[i] is part of LIS and arr[i] is the last element in
	 * LIS,
	 */
	public static int longestIncreasingSubSequence(int[] num) {
		int[] lis = new int[num.length];
		Arrays.fill(lis, 1);
		for (int i = 1; i < num.length; i++) {
			for (int j = 0; j < i; j++) {
				if (num[i] > num[j]) {
					lis[i] = Math.max(lis[i], lis[j] + 1);
				}
			}
		}
		int max = 0;
		for (int i = 0; i < lis.length; i++) {
			max = Math.max(max, lis[i]);
		}
		return max;
	}

	public static void main(String[] args) {
		int[] num = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		System.out.println(longestIncreasingSubSequence(num));
	}
}
