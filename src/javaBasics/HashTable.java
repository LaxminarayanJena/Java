package javaBasics;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable h= new Hashtable();
		h.put("A", "Test");
		h.put("B", "hELLO");
		h.put("C", "world");
		
		System.out.println(h.size());
		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		
		Hashtable<Integer,Integer> h1= new Hashtable<Integer,Integer>();
		h1.put(1, 100);
		//h1.put("A", 200);-ERROR
		
		Hashtable<Integer,String> h2= new Hashtable<Integer,String>();
		
		
		

	}

}
