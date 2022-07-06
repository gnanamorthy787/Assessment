package com.Accessmodifier.Examples;

public class ProtectedFeild {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessProtected ob=new AccessProtected();
		ob.age=22;
		ob.protectedMethod();
		
	}
}
class AccessProtected{
	protected String name="Gnana";
	protected int age;
	protected void protectedMethod() {
		 System.out.println(name+" age is "+age);
	 }

}
