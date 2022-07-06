package com.ThisSuper.Examples;
/**
 * 
 * @author HP
 * 1. Print the fields/instance members of the current class using this and without using object
 * 2. Print the fields/instance members of the parent class using super
 * 3. Call constructor of the current class using this()
 * 4. Call argument constructor of current class using this()
 * 5. Call constructor of the parent class using super()
 * 6. Use this() and super() in methods not in constructor
 *
 */

public class ThisSuper {
	int age;
	String name;
	
	ThisSuper(){
		//4. Call argument constructor of current class using this()
		this(22,"Gnana");
	}
	ThisSuper(int age, String name){
		//1. Print fields of the current class using this
		this.name=name;
		this.age=age;
		System.out.println(name+" age is "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisSuper t1=new ThisSuper();
		ThisSuper t2=new ThisSuper(22,"Gnana");
		child c=new child();
		c.method();
		child1 c1=new child1();
		c1.method3();
		

	}
	

}
class parent{
	String name2="vishnu";
	parent(){
		System.out.println("constructor of Parent class");
	}
}
class child extends parent{
	child(){
		//5. Call constructor of the parent class using super()
		super();
		System.out.println("constructor of child class");
	}
	void method() {
		//2. Print the fields/instance members of the parent class using super
		System.out.println("parent class name is:"+super.name2);
		
	}
}
class parent1{
	void method1() {
		System.out.println("Method in parent class2");
	}
	void method2() {
		//6. Use this() and super() in methods not in constructor
		this.method1();
	}
}
class child1 extends parent1{
	void method3() {
		//6. Use this() and super() in methods not in constructor
		super.method2();
	}
}
