package com.randhir.practice;

public class SortArray {
	public void sortarr_UsingBubble(int a[]) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

	}

	public static void main(String[] args) {
		int[] a = { 6, 2, 50, 8, 4, 1, -2 };
		int[] a2= {'d','q','e','a','c','w','z'};
		new SortArray().sortarr_UsingBubble(a2);

	}

}
