package com.Static.Examples;

public class PrintStaticVariableInInstanceMethod {
	static int age=22;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStaticVariableInInstanceMethod obj=new PrintStaticVariableInInstanceMethod();
		obj.instanceMethod();
		

	}
	void instanceMethod() {
		System.out.println(age+" is a value of static variable");
		
	}

}
