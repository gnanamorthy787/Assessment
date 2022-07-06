package com.Static.Examples;

public class PrintInstanceVariableInStaticMethod {
	int c=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticMethod();

	}
	static void staticMethod() {
		PrintInstanceVariableInStaticMethod obj=new PrintInstanceVariableInStaticMethod();
		System.out.println(obj.c +" is a value of instance variable");
	}

}
