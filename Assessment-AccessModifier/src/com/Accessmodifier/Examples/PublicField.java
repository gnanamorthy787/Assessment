package com.Accessmodifier.Examples;

public class PublicField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicClass obj=new PublicClass();
		obj.name="vishnu";
		obj.publicMethod();

	}

}
class PublicClass{
	public String name="Gnana";
	public int age=22;
	
	public void publicMethod(){
		System.out.println(name+" age is "+age);
	}
}
