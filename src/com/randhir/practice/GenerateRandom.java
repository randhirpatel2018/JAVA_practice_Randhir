package com.randhir.practice;

import java.time.LocalDate;
import java.util.Random;

public class GenerateRandom {
	public String getAlphanumericString(int n) {
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		return sb.toString();

	}

	public String generateRandomDate() {
		Random random = new Random();
		int minDay = (int) LocalDate.of(1970, 1, 1).toEpochDay();
		int maxDay = (int) LocalDate.of(2000, 1, 1).toEpochDay();
		long randomDay = minDay + random.nextInt(maxDay - minDay);
		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
		String dob = randomBirthDate.toString();
		String[] d = dob.split("-");
		String year = d[0];
		String mm=d[1];
		String dd=d[2];
		return year +"/"+mm+"/"+dd;

	}

	public static void main(String[] args) {

		System.out.println(new GenerateRandom().getAlphanumericString(10));
		System.out.println(new GenerateRandom().generateRandomDate());

	}

}
