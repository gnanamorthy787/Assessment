package com.Collections.Examples;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.HashMap<Integer, String> colors = new java.util.HashMap<>();
		
		colors.put(1,"red");
		colors.put(2,"green");
		colors.put(3, "yellow");
		colors.put(4, "blue");
		System.out.println(colors);
		
		System.out.println(colors.get(3));
		
		System.out.println(colors.clone());
		
		System.out.println(colors.containsKey(3));
		
		System.out.println(colors.containsValue("red"));
		
		System.out.println(colors.isEmpty());
		
		System.out.println(colors.size());
		
		System.out.println(colors.keySet());
		
		colors.remove(1,"red");
		System.out.println(colors);

	}

}
