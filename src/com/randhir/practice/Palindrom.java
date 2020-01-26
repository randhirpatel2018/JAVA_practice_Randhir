package com.randhir.practice;

import java.util.ArrayList;
import java.util.List;

public class Palindrom {
	public static void main(String[] args) {
		String str="Randhir";
		char[]ch=str.toCharArray();
		List<Character > reverse=new ArrayList<Character>();
		for (int i = ch.length-1; i >=0; i--) {
			System.out.print(ch[i]);
			reverse.add(ch[i]);
			
		}
		System.out.println(reverse.toString());
		
	}

}
