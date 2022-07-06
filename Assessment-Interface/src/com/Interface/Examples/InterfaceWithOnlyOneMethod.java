package com.Interface.Examples;

public class InterfaceWithOnlyOneMethod implements class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceWithOnlyOneMethod IF=new InterfaceWithOnlyOneMethod();
		IF.oneMethod();
		
	}
	public void oneMethod(){
		System.out.println("This is a method");
	}

}
interface class01{
	void oneMethod();
}

