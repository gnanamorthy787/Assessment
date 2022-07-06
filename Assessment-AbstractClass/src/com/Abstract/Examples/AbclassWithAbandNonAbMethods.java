package com.Abstract.Examples;

public class AbclassWithAbandNonAbMethods{
	public static void main(String[] args) {
		NonAb Na=new NonAb();
		Na.abmethod();
	}
}

abstract class Abclass{
	abstract void abmethod();
	void nonAbmethod() {
		System.out.println("Non abstract method from abstract class is running");
	}
}
class NonAb extends Abclass{
	void abmethod() {
		Abclass obj=new NonAb();
		obj.nonAbmethod();
		NonAb N=new NonAb();
		
		N.nonAbmethod();
		System.out.println("Abstract method does not have body");
	}
	
}