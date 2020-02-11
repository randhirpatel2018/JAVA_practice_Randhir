package com.randhir.practice;

import java.util.Comparator;
import java.util.TreeSet;

public class myCopmparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;
		/*
		 * if (i1 < i2) return +1; else if (i1 > i2) return -1; else return 0;
		 */
		// return i1.compareTo(i2);//return ascending order
		// return -i1.compareTo(i2);//return descending order
		// return i2.compareTo(i1);//return descending order
		// return -i2.compareTo(i1);//return ascending order
		// return +1;//insertion order
		// return -1;//reverse insertion order;
		 return 0; //Only first element will be inserted and remaining will be duplicate

	}

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new myCopmparator());
		t.add(10);
		t.add(20);
		t.add(0);
		t.add(23);
		t.add(3);
		t.add(4);
		System.out.println(t);

	}

}
