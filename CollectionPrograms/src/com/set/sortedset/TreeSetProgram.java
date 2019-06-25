package com.set.sortedset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetProgram {

	public static void setTest() {
		TreeSet<String> tr=new TreeSet<>();
		/*
		 * tr.add(1); tr.add(0); tr.add(5); tr.add(2); tr.add(3);
		 * System.out.println(tr);
		 */
		
		tr.add("dinesh");
		tr.add("chandra");
		tr.add("bhaskar");
		tr.add("ashok");
		
		System.out.println(tr);
		for(String s:tr) {
			System.out.println(s);
		}
		System.out.println(tr.first());
		
		
	}
}
