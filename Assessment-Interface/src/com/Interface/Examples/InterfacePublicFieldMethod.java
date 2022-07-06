package com.Interface.Examples;


class class07 implements InterfacePublicFieldMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class07 cl=new class07();
		System.out.println(a);
		cl.method();

	}
	public void method() {
		System.out.println("Method Of interface");
	}

}
public interface InterfacePublicFieldMethod{
	int a=11;
	public void method();
}
