package com.Operators.Example;

public class ArithmeticOperators {

	public static void main(String[] args) {
		int a=10;
		int b=3;
		System.out.println(add(a,b));
		System.out.println(sub(a,b));
		System.out.println(mul(a,b));
		System.out.println(div(a,b));
		System.out.println(mod(a,b));

	}
	static int add(int x,int y) {
		int z=x+y;
		return z;
	}
	static int sub(int x,int y) {
		int z=x-y;
		return z;
	}
	static int mul(int x,int y) {
		int z=x*y;
		return z;
	}
	static int div(int x,int y) {
		int z=x/y;
		return z;
	}
	static int mod(int x,int y) {
		int z=x%y;
		return z;
	}

}
