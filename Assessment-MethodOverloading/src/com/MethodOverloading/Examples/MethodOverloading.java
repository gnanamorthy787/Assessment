package com.MethodOverloading.Examples;
/**
 * 
 * @author HP
 *1. Write two methods with the same name but different number of parameters of same type and call the methods from main method
 *2. Write two methods with the same name but different number of parameters of different data type and call the methods from main method
 *3. Write two methods with the same name and same number of parameters of same type and call from main method
 *4. Write two methods with the same name and same number of parameters of different type and call from main method 
 *5. Write two methods with the same name, number of parameters and data type but different return Type  
 */

public class MethodOverloading {
	int n1;
	int n2;
	int n3;
	String n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading ol=new MethodOverloading();
		ol.method1(2);
		ol.method1(2, 3);
		ol.method2(4);
		ol.method2(4, "Gnana");
		ol.method3(2);
		ol.method3("Gnana");

	}
	//Write two methods with the same name but different number of parameters of same type and call the methods from main method
	void method1(int n1) {
		this.n1=n1;
		System.out.println("value of n1 :"+n1);
	}
	void method1(int n1,int n2) {
		this.n1=n1;
		this.n2=n2;
		System.out.println("value of n1+n2: "+(n1+n2));
	}
	//. Write two methods with the same name but different number of parameters of different data type and call the methods from main method
	void method2(int n3) {
		this.n3=n3;
		System.out.println("value of n1 :"+n3);
	}
	void method2(int n3,String n) {
		this.n3=n3;
		this.n=n;
		System.out.println("value of n3 is "+n3+" and value of n is "+n);
	}
	//Write two methods with the same name and same number of parameters of different type and call from main method

	void method3(int n1) {
		this.n1=n1;
		System.out.println("value of n1 :"+n1);
	}
	void method3(String n) {
		this.n=n;
		System.out.println("value of n:"+n);
	}
	
	
	

}
