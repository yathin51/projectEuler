package com.euler.problem.stage1;

public class PrimeFactors {

	public PrimeFactors() {
	}

	static boolean checkIsPrimeOrNot(long n) {
		int triggerSize = 0;
		for (int j = 0; j < Math.sqrt(n); j++) {
			if (n % j == 0) {
				triggerSize++;
			}
		}
		if (triggerSize > 0)
			return false;
		else
			return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long n = 600851475143l;

		// Print the number of 2s that divide n

		
		// n must be odd at this point. So we can skip one element (Note i = i
		// +2)
		for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
			// While i divides n, print i and divide n
			if (checkIsPrimeOrNot(i)) {
				for (int j = 0; j < Math.sqrt(i); j++) {
					while (n % i == 0) {
						System.out.print(i);
						System.out.println(",");
						// n = n/i;
					}
				}
			}

		}

	}
}
