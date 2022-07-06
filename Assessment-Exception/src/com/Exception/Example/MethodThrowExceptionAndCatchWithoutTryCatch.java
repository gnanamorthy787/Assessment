package com.Exception.Example;

public class MethodThrowExceptionAndCatchWithoutTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Catch the exception without Try and Catch");
	    throwException();
	    }
	    static void throwException() {
	        throw new RuntimeException("Throwing exception");
	    }

}
