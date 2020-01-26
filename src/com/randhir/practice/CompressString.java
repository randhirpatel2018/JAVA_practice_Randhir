package com.randhir.practice;

public class CompressString {

	public static void main(String[] args) {
		String str = "aaabbbcccdddfh";
		char[] ch = str.toCharArray();
		char temp = str.charAt(0);
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (temp == ch[i]) {
				count++;

			} else {
				System.out.print(temp + "" + count);
				count = 1;
				temp = ch[i];

			}

		}
		System.out.print(temp + "" + count);

	}

}
