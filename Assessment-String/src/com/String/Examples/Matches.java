package com.String.Examples;

public class Matches {

	public static void main(String[] args) {

		 String ms = "Matching a String";
	    
	     boolean match = ms.matches("(.*)String(.*)");
	        
	     System.out.println("Matches : " + match);

	}

}
