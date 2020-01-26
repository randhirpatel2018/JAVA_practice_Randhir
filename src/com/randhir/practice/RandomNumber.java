package com.randhir.practice;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		int num1, num2, num3; 
        int set2, set3; 
        Random generator = new Random();
        num1 = generator.nextInt(7) + 1; 
        num2 = generator.nextInt(8); 
        num3 = generator.nextInt(8);
        set2 = generator.nextInt(643) + 100;
        set3 = generator.nextInt(8999) + 1000;
        String str=num1 + "" + num2 + "" + num3+""+ set2 + "" + set3;
        System.out.println (str );
	}

}
