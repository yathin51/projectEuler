package com.euler.problem.stage1;

public class EvenFibonacci {

	public EvenFibonacci() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int previousNumber = 0;
		int currentNumber = 1;
		int summedUpValue = 0;

		
		while (currentNumber < 4000000) {
			int temp = previousNumber + currentNumber;
			previousNumber = currentNumber;
			currentNumber = temp;
			if (temp % 2 == 0) {
				summedUpValue += temp;
			}

		}
		System.out.println(summedUpValue);

		// while (listOfNumbers.get(listOfNumbers.size() - 1) < 4000000) {
		// listOfNumbers.add(listOfNumbers.get(listOfNumbers.size() - 2)
		// + listOfNumbers.get(listOfNumbers.size() - 1));
		// }
		//
		// for (int i = 0; i < listOfNumbers.size() - 1; i++) {
		//
		// if(listOfNumbers.get(i)%2==0){
		// summedValue += listOfNumbers.get(i);
		// }
		// else
		// continue;
		// }
		//
		// System.out.println(summedValue);
	}

}