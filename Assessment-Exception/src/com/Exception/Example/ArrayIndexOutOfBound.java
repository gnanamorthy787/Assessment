package com.Exception.Example;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] arr = {"Gnana", "Arun", "Kiruba", "Nishanth"};
	        try {
	            System.out.println(arr[5]);
	        }
	        catch (ArrayIndexOutOfBoundsException e){
	            System.err.println("ArrayIndexOutOfBoundsException caught");
	            e.printStackTrace();
	        }

	}

}
