package com.mertao.codewars.kyu6;

public class MultiplyOf3or5 {
	public int solution(int number) {
		int result = 0;
		for (int i = 1; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				result = result + i;
			}
		}
		return result;
	  }
}

// not my solution
// public int solution(int number) {
//    return IntStream.range(0, number)
//                    .filter(n -> (n % 3 == 0) || (n % 5 == 0))
//                    .sum();
//  }
