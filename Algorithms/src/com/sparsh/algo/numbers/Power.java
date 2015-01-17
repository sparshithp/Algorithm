package com.sparsh.algo.numbers;

public class Power {

	public double pow(double x, int n) {
		if (n < 0)
			return 1 / powHelper(x, -1 * n);
		else
			return powHelper(x, n);
	}

	public double powHelper(double x, int n) {
		if (n == 0)
			return 1;
		double half = powHelper(x, n / 2);
		double result = half * half;
		if (n % 2 != 0)
			result = result * x;
		return result;
	}

}
