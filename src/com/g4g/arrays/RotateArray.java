package com.g4g.arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6};
		print(a);
		rotateArray(a,2);
		//reverse(a,0,a.length);
		print(a);
		
	}

	private static void rotateArray(int[] a, int d) {
		
      reverse(a,0,d);
      reverse(a,d,a.length);
      reverse(a,0,a.length);
		
	}

	private static void reverse(int[] a, int start, int end) {
		 --end;
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
