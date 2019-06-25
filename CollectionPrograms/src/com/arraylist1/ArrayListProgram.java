package com.arraylist1;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListProgram {

	public static void arrayListTesting() {
		
		ArrayList l=new ArrayList();
		l.add(20);
		l.add("chandra");
		l.add(12.4f);
		l.add('c');
		l.add("mahesh");
		l.add(20);
		System.out.println(l);
		System.out.println(l.get(0));
		l.remove(0);
		System.out.println(l);
		System.out.println(l.contains("chandr"));
		for(Object ob:l) {
			System.out.println(ob);
		}
		System.out.println("----------------------");
		 ListIterator<Object> li=l.listIterator();
		 while(li.hasNext()) {
			 Object ob=li.next();
			 
			 System.out.println("*******************");
			 System.out.println(ob);
			 System.out.println("*******************");
			 
			 if(ob.equals("chandra")) {
				 li.set("jaya");
			 }
			 if(ob.equals(20)) {
				 li.remove();
			 }
			 if(ob.equals("mahesh")) {
				 li.add("chiru");
			 }
			           
			           
			           
		 }
		System.out.println(l);
	}
}
