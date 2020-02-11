package com.randhir.practice;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("K"));
		System.out.println("A".compareTo("A"));
		//System.out.println("A".compareTo(null));
		TreeSet t=new TreeSet();
		t.add("K");
		t.add("A");
		t.add("C");
		t.add("Z");
		t.add("C");
		System.out.println(t);
		

	}

}
