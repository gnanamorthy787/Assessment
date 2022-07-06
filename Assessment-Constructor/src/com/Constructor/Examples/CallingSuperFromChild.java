package com.Constructor.Examples;

public class CallingSuperFromChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new child11();
		new child11(21);
		new child11("vishnu","male","Dakshine","usha");

	}

}
class child11 extends Parent{
	String father;
	String mother;
	 child11(){
		 super();
	 }
	 child11(int age){
		 super(age);
	 }
	 child11(String name,String sex,String father,String mother){
		 super(name,sex);
		 this.father=father;
		 this.mother=mother;
		 System.out.println("Father name :"+father+" and Mother name is:"+mother);
	 }
}
