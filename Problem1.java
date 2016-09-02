package com.euler.problem.stage1;

public class Problem1 {

	public Problem1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i =1000;
		int sum = 0;
		
		for (int j=0; j<i; j++){
			if(j%3==0 || j%5==0)
				sum+=j;
		}
		System.out.println(sum);
	}

}
