package com.Static.Examples;

public class CallingInsStaMethodsFromMain {
	static int a=1;
	int c=3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallingInsStaMethodsFromMain obj=new CallingInsStaMethodsFromMain();
		stMethod1();
		obj.inMethod1();

	}
	static void stMethod1() {
		System.out.println(a+" is the value of static var A");
		
	}
	void inMethod1() {	
		System.out.println(c+" is the value of instance var C");
	}

}
