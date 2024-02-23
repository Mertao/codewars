package com.mertao.codewars.kyu6;

public class FindTheParityOutlier {
	public static int find(int[] integers) {
		int oddCount = 0, odd = 0, evenCount = 0, even = 0;
		for (int num : integers) {
			if (num % 2 == 0) {
				evenCount++;
				even = num;
			}
			else {
				oddCount++;
				odd = num;
			}
			if (evenCount > 0 && oddCount > 0) {
				if (evenCount > 1) {
					return odd;
				}
				if (oddCount > 1) {
					return even;
				}
			}
		}
		return evenCount > 1 ? odd : even;
	}
}
