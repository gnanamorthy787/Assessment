package com.Static.Examples;

public class CallingStaticMethodFromInstanceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallingStaticMethodFromInstanceMethod obj= new CallingStaticMethodFromInstanceMethod();
		obj.instanceMethod();

	}
	static void staticMethod() {
		System.out.println("Successfully static method is called from instance method");
	}
	void instanceMethod() {
		staticMethod();
	}

}
