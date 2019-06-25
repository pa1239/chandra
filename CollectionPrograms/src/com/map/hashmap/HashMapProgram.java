package com.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapProgram {

	public static void aboutHashMap() {
		Map<String, String> hm=new HashMap<>();
		hm.put("madhu", "bhargavi");
		hm.put("ashok","aparna");
		hm.put("vikram","abhi");
		hm.put("chandra","bhargavi");
		hm.put("pratap","xx");
		hm.put("chandra","jaya");
		System.out.println(hm);
		
		Set<String>keys=hm.keySet();
		System.out.println("all the keys are:"+keys);
		System.out.println("**************************");
		Collection<String> values=hm.values();
		System.out.println("all the values are:"+values);
		
		Set<Map.Entry<String,String>> eset=hm.entrySet();
		System.out.println(eset);
		
		Iterator<Map.Entry<String, String>> itr=eset.iterator();
		while(itr.hasNext()) {
			Map.Entry<String, String> map=itr.next();
			
			System.out.println(map.getKey()+"  "+map.getValue());
		}
		for(String ss:keys) {
			String v=hm.get(ss);
			System.out.println(ss+" == "+v);
		}
	}
}
