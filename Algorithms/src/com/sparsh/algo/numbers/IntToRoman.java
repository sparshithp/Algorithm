package com.sparsh.algo.numbers;

/* 
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 I = 1; 
 V = 5; 
 X = 10; 
 L = 50; 
 C = 100; 
 D = 500; 
 M = 1000; 
 */

public class IntToRoman {

	public String intToRoman(int num) {

		int[] nums = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] digits = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
				"IX", "V", "IV", "I" };

		StringBuffer sb = new StringBuffer();

		int i = 0;

		while (num > 0) {
			int times = num / nums[i];

			num = num - nums[i] * times;

			for (; times > 0; times--) {
				sb.append(digits[i]);
			}
			i++;
		}

		return sb.toString();
	}

}
