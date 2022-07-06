package com.Interface.Examples;

public class InterfaceWithTwoMethods implements class02{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceWithTwoMethods IF=new InterfaceWithTwoMethods();
		IF.oneMethod1();

	}
	public void oneMethod1(){
		System.out.println("This is first method");
	}
	public void twoMethod2(){
		System.out.println("This is second method");
	}

}
interface class02{
	void oneMethod1();
	void twoMethod2();
}

