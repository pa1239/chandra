package com.sortedmap.treemap;

import java.io.FileNotFoundException;
import java.util.TreeMap;

public class SortedMapProgram {

	public static void getDefaultSorting(){
		TreeMap<Integer, Integer> tm=new TreeMap<>();
		tm.put(5, 6);
		tm.put(10, 11);
		tm.put(1,2);
		tm.put(15,16);
		tm.put(3,100);
		System.out.println(tm);
		for(Integer in:tm.keySet()) {
			
			System.out.println(in+"---"+tm.get(in));
			
		}
	}
}
