package com.sparsh.algo.arrays;

public class SortColors {
	/*
	 * One way is to count all the colours and then substitute those values in
	 * another pass. The below solution is a two pass method
	 */

	public void sortColors(int[] A) {
		int red = 0;
		int blue = A.length - 1;
		int i = 0;
		while (i <= blue) {
			if (A[i] == 0) {
				int temp = A[i];
				A[i] = A[red];
				A[red] = temp;
				red++;
				i++;
				continue;
			}
			// If blue colour then dont increment i because when you swap, there
			// could be a different colour there
			if (A[i] == 2) {
				int temp = A[i];
				A[i] = A[blue];
				A[blue] = temp;
				blue--;
				continue;
			}
			i++;
		}
	}
}
