package com.Static.Examples;

public class CallingInstanceMethodFromStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticMethod();

	}
	static void staticMethod() {
		CallingInstanceMethodFromStaticMethod obj=new CallingInstanceMethodFromStaticMethod();
		obj.instanceMethod();
	}
	void instanceMethod() {
		System.out.println("Successfully instance method is called from static method");
	}

}
