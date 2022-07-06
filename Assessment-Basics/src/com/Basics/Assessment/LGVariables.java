package com.Basics.Assessment;

public class LGVariables {

	public static void main(String[] args) {
		LGVariables obj=new LGVariables();
		String name="gnana";
		// name is global variable
		int age=obj.local();
		System.out.println(name+" is "+age+" years old");
	}
	public int local() {
		int a=22;
		// a is local variable
		return a;
	}

}
