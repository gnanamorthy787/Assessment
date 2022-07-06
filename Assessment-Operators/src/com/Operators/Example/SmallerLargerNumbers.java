package com.Operators.Example;

public class SmallerLargerNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=30;
		int c=40;
		
		if((a>b)&&(a>c)) {
			System.out.println("A is Largest Number");
		}else if((b>a)&&(b>c)) {
			System.out.println("B is Largest Number");
		}else {
			System.out.println("C is Largest Number");
		}

		if((a<b)&&(a<c)) {
			System.out.println("A is Smallest Number");
		}else if((b<a)&&(b<c)) {
			System.out.println("B is Smallest Number");
		}else {
			System.out.println("C is Smallest Number");
		}

	}

}
