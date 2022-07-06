package com.Exception.Example;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	          int[] a = new int[6];
	          a[6] = 10 / 0;
	          System.out.println(a[10]);
	        }
	        catch (ArithmeticException e) {
	            System.out.println("Arithmetic Exception");
	            e.getStackTrace();
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBounds Exception");
	            e.getStackTrace();
	        } catch (Exception e) {
	            System.out.println("Parent Exception");
	            e.getStackTrace();
	        }
		 System.out.println("Try block contains two exceptions. But at a time only one exception occurs and its corresponding catch block is executed.");

	}

}
