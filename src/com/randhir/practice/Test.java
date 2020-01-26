package com.randhir.practice;

public class Test {
	public static void main(String[] args) {
		try {
			throw new MyException("test");

		} catch (MyException e) {
			System.out.println("Exception cought");
			System.out.println(e.getMessage());
			e.printStackTrace();

		}

	}

}
