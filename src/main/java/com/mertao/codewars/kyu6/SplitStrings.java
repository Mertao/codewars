package com.mertao.codewars.kyu6;

public class SplitStrings {
	public static String[] solution(String s) {
		s = s.length() / 2 == 0 ? s : s + "_";
		
        String[] result = new String[s.length() / 2];
        for (int i = 0; i < s.length() / 2; i++) {
        	result[i] = s.substring(i * 2, (i + 1) * 2);
        }
		return result;
    }
}
