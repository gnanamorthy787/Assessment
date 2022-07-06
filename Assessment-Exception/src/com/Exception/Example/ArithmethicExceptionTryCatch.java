package com.Exception.Example;

public class ArithmethicExceptionTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 10, b = 2, c;
	        try {
	            System.out.println("Inside try block");
	            c = a + b;
	            System.out.println("c = " + c);
	        }
	        catch (java.lang.ArithmeticException e) {
	            System.out.println("Handling the Arithmetic exception using try-catch block");
	        }
	        c = a + b;
	        System.out.println("without exception handling");
	    

	}

}
