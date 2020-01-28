package com.randhir.practice;

import java.util.Date;

public class Temp {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d.toString());
		String name=d.toString().replace(" ", "_");
		System.out.println(name);
		
	}

}
