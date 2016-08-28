package com.g4g.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6};
		print(a);
		reverse(a,a.length);
		print(a);
		
	}

	private static void reverse(int[] a, int length) {
		int start = 0;
		int end = length -1;
		while(start <= end) {
			swap(a,start,end);
			++start;
			--end;
		}
		
	}

	private static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
		
	}

	private static void print(int[] a) {
		for (int i : a) {
			System.out.print(i);
		}
		System.out.println();
		
	}

	
}
