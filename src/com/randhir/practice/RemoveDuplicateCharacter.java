package com.randhir.practice;

import java.util.HashMap;
import java.util.Set;

public class RemoveDuplicateCharacter {
	

	public static void main(String[] args) {
		String str="qweasdsafgewfrwsauidfqewutfqwuidwfoejfaiweo";
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] < ch[j]) {
					int temp = ch[i];
					ch[i] = ch[j];
					ch[j] = (char) temp;
				}

			}

		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + ",");
		}
		HashMap<Character, Integer> dupMap=new HashMap<Character, Integer>();
		for (char c : ch) {
			if(dupMap.containsKey(c)) {
				dupMap.put(c, dupMap.get(c)+1);
			}
			else {
				dupMap.put(c, 1);
			}
		}
		System.out.println(dupMap);
		Set<Character> cha = dupMap.keySet();
		for (Character chara : cha) {
			System.out.println(chara+",");
			
		}
		
		
		

	}

}
