package com.Accessmodifier.Examples;

public class PrivateFeild {
	private String name="Gnana";
	private int age=22;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateFeild obj=new PrivateFeild();
		obj.PriMethod();

	}
	private  void PriMethod() {
		System.out.println(name+" age is "+age);
	}

}
