package com.g4g;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumPairs {
	private static int[] a = { 1, 4,11,5,32,5, 45, 6, 30,7,10, -8 };

	public static void main(String[] args) {
		int sum = 37;
		List<Pair> pairs = getPairs(a, sum);
		print(pairs);
	}

	private static void print(List<Pair> pairs) {
		for (Pair pair : pairs) {
			System.out.println(pair);
		}
	}

	private static List<Pair> getPairs(int[] a, int sum) {
		List<Pair> pairs = new ArrayList<Pair>();
		Arrays.sort(a);

		int start = 0;
		int end = a.length - 1;
		while (start < end) {
			if (sum < a[start] + a[end]) {
				--end;
			} else if (sum > a[start] + a[end]) {
				++start;
			} else {
				 pairs.add(new Pair(a[start], a[end]));
				++start;
				--end;
			}
		}

		return pairs;
	}

	static class Pair {
		
		
		@Override
		public String toString() {
			return "Pair [i=" + i + ", j=" + j + "]";
		}
		
		private int i;
		private int j;
		
		public Pair(int i, int j) {
			this.i = i;
			this.j = j;
		}
		
	}
}

