package com.Interface.Examples;

public class TwoInterfaceOneMethod implements class03,class04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoInterfaceOneMethod TF=new TwoInterfaceOneMethod();
		TF.method4();
		TF.method5();

	}
	public void method4(){
		System.out.println("Method from interface 1");
	}
	public void method5() {
		System.out.println("Method from interface 2");
	}

}
interface class03{
	void method4();
}
interface class04{
	void method5();
}
