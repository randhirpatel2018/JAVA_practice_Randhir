package com.randhir.practice;

public class FibonnaciSeries {
	public static void main(String[] args) {
		int fisrtNumber = 0;
		int secondNumber = 1;
		System.out.println(fisrtNumber);
		System.out.println(secondNumber);
		for (int i = 0; i < 10; i++) {
			int thirdNumber = fisrtNumber + secondNumber;
			System.out.println(thirdNumber);
			fisrtNumber = secondNumber;
			secondNumber = thirdNumber;
		}

	}

}
