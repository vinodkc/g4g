package com.g4g.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OddFrequency {

	public static void main(String[] args) {
		int[] a = { 1,1,1, 2, 2, 3, 2, 3,3, 1};
		System.out.println("Odd frequency item " + findOddFrequencyItem(a));

	}

	private static Integer findOddFrequencyItem(int[] a) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			Integer val = map.get(a[i]);
			if (val != null) {
				++val;
			} else {
				val = 1;
			}
			map.put(a[i], val);
		}
		Set<Integer> set = map.keySet();
		Integer oddfreq = null;
		int frequency = 0;
		for (Integer key : set) {
			int val = map.get(key);
			if(val > frequency && val % 2 != 0) {
				frequency = val;
				oddfreq = key;
				
			}
		}
		return oddfreq;
	}

}
