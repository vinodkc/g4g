package com.g4g;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumTuples {
	private static int[] a = { 1, 4, 11, 5, 32, 45, 6, 30, 7, 10, -8 };

	public static void main(String[] args) {
		int sum = 40;

		List<Tuple> Tuples = getTuples(a, sum);
		print(Tuples);
	}

	private static void print(List<Tuple> Tuples) {
		for (Tuple Tuple : Tuples) {
			System.out.println(Tuple);
		}
	}

	private static List<Tuple> getTuples(int[] a, int sum) {
		List<Tuple> tuples = new ArrayList<Tuple>();
		Arrays.sort(a);
		for (int diff : a) {

			int start = 1;
			int end = a.length - 1;
			while (start < end) {
				if (sum < a[start] + a[end] + diff) {
					--end;
				} else if (sum > a[start] + a[end] + diff) {
					++start;
				} else {
					tuples.add(new Tuple(a[start], a[end], diff));
					// System.out.println("("+a[start]+","+ a[end]+")");
					++start;
					--end;
				}
			}

		}

		return tuples;
	}

	static class Tuple {

		@Override
		public String toString() {
			return "Tuple [i=" + i + ", j=" + j + ", k=" + k + "]";
		}

		private int i;
		private int j;
		private int k;

		public Tuple(int i, int j, int diff) {
			this.i = i;
			this.j = j;
			this.k = diff;
		}

	}
}
