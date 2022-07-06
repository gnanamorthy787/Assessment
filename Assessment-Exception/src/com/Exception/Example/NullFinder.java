package com.Exception.Example;

public class NullFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = null;
	        try {
	            NullCheck(input);
	        } catch (NullPointerException e) {
	            System.out.println("NullPointerException caught!");
	            e.printStackTrace();
	        }
	}
	static void NullCheck(String str) {
        System.out.println(str.length());
    }


}
