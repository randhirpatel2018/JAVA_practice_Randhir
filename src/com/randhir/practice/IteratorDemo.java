package com.randhir.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		ArrayList al = new ArrayList();
		for (int i = 0; i <= 10; i++) {
			al.add(i);
		}
		System.out.println(al);
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			if (i % 2 == 0) {
				System.out.println(i);

			} else {
				it.remove();

			}
		}
		System.out.println(al);

	}

}
