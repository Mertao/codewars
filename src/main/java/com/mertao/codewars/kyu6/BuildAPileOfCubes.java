package com.mertao.codewars.kyu6;

public class BuildAPileOfCubes {
	public static long findNb(long m) {
		// your code
		long result = 1;
		
		long i = 0;
		while (true) {
			i = i + (long) Math.pow(result, 3);
			
			if (i == m) {
				return result;
			}
			
			if (i > m) {
				return -1;
			}
			
			result += 1;
		}
	}
	
//	not my solution
//	public static long findNb(long m) {
//		long n = 0;
//		long cubeSize = 0;
//		for (; cubeSize < m; n++)
//			cubeSize += n * n * n;
//		return (cubeSize == m) ? n - 1 : -1;
//	}
}
