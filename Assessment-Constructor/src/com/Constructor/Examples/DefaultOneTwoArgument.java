package com.Constructor.Examples;

public class DefaultOneTwoArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Parent();
		new Parent(22);
		new Parent("Gnana","Male");	

	}

}
class Parent{
	int age;
	String name;
	String sex;
	
	Parent(){
		System.out.println("Persons deatils are");
	}
	Parent(int age){
		this.age=age;
		System.out.println("Age :"+age);
	}
	Parent(String name,String sex){
		this.name=name;
		this.sex=sex;
		System.out.println("Name :"+name);
		System.out.println("Sex :"+sex);
	}
}
