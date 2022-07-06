package com.Exception.Example;

public class GenerateArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 10, b = 0, c;
	        try {
	            c = a / b;
	        } catch (ArithmeticException e) {
	            System.err.println("ArithmeticException caught!");
	            e.printStackTrace();
	        }
	}

}
