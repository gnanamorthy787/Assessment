package com.Basics.Assessment;

public class ClassObjectMethodExample {

	public static void main(String[] args) {
		ClassObjectMethodExample obj= new ClassObjectMethodExample();
		
		String name="Ram";
		boolean age=true;
		char wno='A';
		
		
		float result = obj.m1(name,age);
		System.out.println(result);
		
		int result1=obj.m6();
		System.out.println(result1);
		
		m4();

	}
	public float m1(String s, boolean i) 
	{
		float v=2.4f;
		return v;
	}
	public int m3(char c)
	{
		int num=25;
		return num;
	}
	public static void m4() {
		
	}
	public void m5() {
		
	}
	public int m6() {
		int age=18;
		return age;
	}

}
