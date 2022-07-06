package com.Interface.Examples;

public class TwoInterfaceSameMethod implements class05,class06{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoInterfaceSameMethod TI=new TwoInterfaceSameMethod();
		TI.sum();

	}
	public void sum() {
		System.out.println("Sum is common method for both interface");
	}
}
interface class05{
	void sum();
}
interface class06{
	void sum();
}
