package com.Interface.Examples;

public class InterfaceDefaultMethod implements interfacedefault{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDefaultMethod ID=new InterfaceDefaultMethod();
		ID.method();

	}

}
interface interfacedefault{
	default void method(){
		System.out.println("Default method in interface");
	}
}
