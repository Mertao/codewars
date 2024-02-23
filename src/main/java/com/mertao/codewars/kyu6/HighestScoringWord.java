package com.mertao.codewars.kyu6;


public class HighestScoringWord {
	public static String high(String s) {
		String result = "";
		long score = 0;
		for (String word : s.split(" ")) {
			long tempScore = 0;
			for (int i = 0; i < word.length(); i++) {
				tempScore = tempScore + word.charAt(i) - 96;
			}
			if (tempScore > score) {
				score = tempScore;
				result = word;
			}
		}
		
		return result;
	}
}
