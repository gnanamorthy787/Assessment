package com.Exception.Example;

public class StringIndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Moorthy";
	        try {
	            char NegativeIndex = str.charAt(-1);
	            char LengthIndex = str.charAt(11);
	        } catch (StringIndexOutOfBoundsException e) {
	            System.err.println("StringIndexOutOfBoundsException caught");
	            e.printStackTrace();
	        }

	}

}
