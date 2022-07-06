package com.Collections.Examples;

import java.util.Arrays;

import java.util.Iterator;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.ArrayList<String> animals=new java.util.ArrayList<>(Arrays.asList("Lion","Tiger","Fox","Bear"));
		System.out.println("Amimals: "+ animals);
		
		animals.add("Deer");
		animals.add("Elephant");
		System.out.println(animals);
		
		Iterator<String> it=animals.iterator();
		System.out.println("\nIterating through the ArrayList : ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println(" ");
        
        animals.add(1,"Wild Animals");
        System.out.println(animals);
        System.out.println(" ");
        
        animals.remove(1);
        System.out.println(animals);
        System.out.println(" ");
        
        animals.set(1,"Rinoserous");
        System.out.println(animals);
        System.out.println(" ");
        
        System.out.println("Index of lion:"+animals.indexOf("Lion"));
        System.out.println(" ");
        
        System.out.println("Animal at the index 3:"+animals.get(3));
        System.out.println(" ");
        
        System.out.println("Size of animals:"+animals.size());
        System.out.println(" ");
        
        System.out.println("Checking using contains:"+animals.contains("Deer"));
        System.out.println(" ");
        
        System.out.println("Clear the elements from the array");
        animals.clear();
        System.out.println(animals);
        
        
	}

}
