package com.mertao.codewars.kyu7;

public class IsThisATriangle {
	public static boolean isTriangle(int a, int b, int c) {		
		return a + b > c && b + c > a && c + a > b;
	}
}
