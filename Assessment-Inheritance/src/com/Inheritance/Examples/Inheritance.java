package com.Inheritance.Examples;


	
	class A{
		int n=1;
		void methodA1() {
			System.out.println("The value of n: "+n);
		}
		void methodA2() {
			System.out.println("Second method of Class A ");
		}
		void method3() {
			System.out.println("Third method of class A");
		}
	}
	class B extends A{
		int m=2;
		void methodB1() {
			System.out.println("The value of m: "+m);
		}
		void methodB2() {
			System.out.println("n+m="+(n+m));
		}
		void method3() {
			System.out.println("Method over riding accessing method of parent class");
		}
	}
	class C extends B{
		int l=3;
		void methodC1() {
			System.out.println("The value of L: "+l);
		}
		void methodC2() {
			System.out.println("n+m+l="+(n+m+l));
		}
		void method3() {
			System.out.println("Method over riding accessing method of parent class");
		}
	}
	public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.methodA1();
		a.methodA2();
		a.method3();
		B b=new B();
		b.methodB1();
		b.methodB2();
		b.method3();
		C c=new C();
		c.methodC1();
		c.methodC2();
		c.method3();
		
		A overRide;
		overRide=new B();
		overRide.method3();
		overRide=new C();
		overRide.method3();
		
		 A rtp;
	     rtp = new A();
	     System.out.println(rtp.n);
	     rtp = new B();
	     System.out.println(rtp.n);
	     rtp = new C();
	     System.out.println(rtp.n);
		
		
		
		

	}

}
