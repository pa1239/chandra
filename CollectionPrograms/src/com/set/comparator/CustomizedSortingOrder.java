package com.set.comparator;

import java.util.Comparator;

public class CustomizedSortingOrder implements Comparator<Integer>{

	@Override
	public int compare(Integer n1, Integer n2) {
		Integer n3=n1;
		Integer n4=n2;
		
		if(n3<n4) {
			return 1;
		}
		else if(n3>n4){
			return -1;
		}
		return 0;
	}

	
}
