package com.arraylist.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListUtilityProgram {

	public static void main(String[] args) {
		//List<Integer> ar=Arrays.asList(4,5,3,3,4);
		ArrayList ar=new ArrayList<>();
		ar.add(4);
		ar.add(1);
		ar.add(3);
		ar.add(4);
		//ar.add("hdsj");
		System.out.println("Before sorting:"+ar);
		System.out.println("hhh");
		System.out.println("aaa");
		Collections.sort(ar);
		
		System.out.println("After sorting:"+ar);
		Collections.reverse(ar);
		System.out.println(ar);
		for(Object in:ar) {
			
			System.out.println(in);
		}
		
	}
}
