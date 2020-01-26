package com.randhir.practice;

public class Swapping2Number {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("a value is :" + a + " ---- " + "b value is :" + b);
		// logic usnig third variable
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a value after swaping is :" + a + " ---- " + "b after swaping value is :" + b);
		// logic 2
		a = a + b;
		b = a - b;
		a = a - b;

	}

}
