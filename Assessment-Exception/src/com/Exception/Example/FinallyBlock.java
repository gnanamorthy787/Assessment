package com.Exception.Example;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            int data = 10 / 0;
	            System.out.println(data);
	        }
	        catch (ArithmeticException e) {
	            System.out.println("Exception handled");
	            e.printStackTrace();
	        }
	        finally {
	            System.out.println("finally block is always executed");
	        }
	        System.out.println("Finally Block Contains All Necessary Statements that need to be print");

	}

}
