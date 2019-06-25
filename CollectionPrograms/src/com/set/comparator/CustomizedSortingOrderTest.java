package com.set.comparator;

import java.util.TreeSet;

public class CustomizedSortingOrderTest {
public static void main(String[] args) {
	
	TreeSet<Integer> tr=new TreeSet<>(new CustomizedSortingOrder());
	tr.add(45);
	tr.add(100);
	tr.add(2);
	tr.add(15);
	tr.add(3);
	System.out.println(tr);
}
}
