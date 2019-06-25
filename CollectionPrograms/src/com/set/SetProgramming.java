package com.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetProgramming {

	public static void setTesting() {
		/*Set<Integer> hs=new HashSet<>();
		hs.add(100);
		hs.add(1);
		hs.add(23);
		hs.add(0);
		hs.add(121);
		hs.add(1);
		System.out.println(hs);
		for(Integer in:hs) {
			System.out.println(in);
		}*/
		
		Set<Integer> hs=new LinkedHashSet<>();
		hs.add(100);
		hs.add(1);
		hs.add(23);
		hs.add(0);
		hs.add(121);
		//hs.add(1);
		System.out.println(hs);
		for(Integer in:hs) {
			System.out.println(in);
		}
		
		System.out.println("***************");
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext()) {
			Integer in=it.next();
			if(in.equals(100)) {
				it.remove();
			}
			System.out.println(in);
		}
		
		System.out.println(hs);
	}
}
