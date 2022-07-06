package com.Interface.Examples;

public class InterfaceInherit implements gnana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceInherit II=new InterfaceInherit();
		II.method1();
		II.method2();

	}
	public void method1() {
		System.out.println("method from Gnana");
	}
	public void method2() {
		System.out.println("method from moorthy");
	}

}
interface gnana{
	void method1();
}
interface moorthy extends gnana{
	void method2();
}
