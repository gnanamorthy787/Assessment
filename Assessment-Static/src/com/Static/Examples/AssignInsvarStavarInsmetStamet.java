package com.Static.Examples;

public class AssignInsvarStavarInsmetStamet {
	static int a=1;
	static int b=2;
	int c=3;
	int d=4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignInsvarStavarInsmetStamet call=new AssignInsvarStavarInsmetStamet();
		stMethod1();
		stMethod2();
		call.inMethod1();
		call.inMethod2();

	}
	static void stMethod1() {
		System.out.println(a+" is the value of static var A");
		
	}
	void inMethod1() {	
		System.out.println(c+" is the value of instance var C");
	}
    static void stMethod2() {
    	System.out.println(b+" is the value of static var B");
	}
    void inMethod2() {
		System.out.println(d+" is the value of instance var D");
	}

}
