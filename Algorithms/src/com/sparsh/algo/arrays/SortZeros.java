/*
 * Given an array, move all the zeros to the end and return the number of 
 * nonzero elements in the array
 */

package com.sparsh.algo.arrays;

public class SortZeros {

	public static void main(String[] args) {
		int[] num = { 2, 3, 1, 0, 0, 1, 3, 4, 0 };
		System.out.println(sortZeros(num));
	}

	public static int sortZeros(int[] num) {
		int j = num.length - 1;
		int i = 0;
		while (i <= j) {
			if (num[i] == 0) {
				int temp = num[j];
				num[j] = num[i];
				num[i] = temp;
				j--;
				continue;
			}
			i++;
		}
		return i;
	}
}
