package com.Collections.Examples;

import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.HashSet<String> animals = new java.util.HashSet<>();
		
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		
		animals.add("Cow");
		System.out.println(animals);
		
	    Iterator<String> itr = animals.iterator();
	       System.out.println("\nIterating through the HashSet : ");
	       while (itr.hasNext()) {
	           System.out.print(itr.next() + " ");
	       }
	       System.out.println(" ");
	       
	    System.out.println(animals.clone());
	    
	    animals.remove("Cow");
	    System.out.println(animals);
	    
	    System.out.println(animals.isEmpty());
	    
	    System.out.println(animals.size());
	    
	    System.out.println(animals.contains("Cow"));
	    
	    animals.clear();
	    System.out.println(animals);

	}

}
