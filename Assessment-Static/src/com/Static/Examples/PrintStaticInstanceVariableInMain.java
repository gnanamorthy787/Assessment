package com.Static.Examples;

public class PrintStaticInstanceVariableInMain {
	int a=1;
	static int b=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStaticInstanceVariableInMain obj=new PrintStaticInstanceVariableInMain();
		System.out.println(b+" is a satic variable value");
		System.out.println(obj.a+" is a value of instance variable");

	}

}
