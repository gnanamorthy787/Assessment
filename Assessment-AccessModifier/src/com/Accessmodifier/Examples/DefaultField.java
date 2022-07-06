package com.Accessmodifier.Examples;

public class DefaultField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessDefault obj=new AccessDefault();
		obj.name="Gnana";
		obj.age=22;
		obj.defaultMethod();

	}

}
class AccessDefault{
	int age;
	String name;
	
	void defaultMethod(){
		System.out.println(age+" is age of "+name);
	}
}
