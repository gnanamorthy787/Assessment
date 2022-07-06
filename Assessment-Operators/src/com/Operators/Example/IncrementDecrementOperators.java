package com.Operators.Example;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		increment(a,b);
		decrement(a,b);

	}
	static void increment(int x,int y) {
		int i,j;
		i=y+(++x);
		System.out.println("Preincrement value is "+i);
		System.out.println("During the preincrement the increment was occurs before process execution "+x);
		j=y+(x++);
		System.out.println("Postincrement value is "+j);
		System.out.println("During the postincrement the increment was occurs after process execution "+x);
		
	}
	static void decrement(int x,int y) {
		int i,j;
		i=y+(--x);
		System.out.println("Predecrement value is "+i);
		System.out.println("During the predecrement the decrement was occurs before process execution "+x);
		j=y+(x--);
		System.out.println("Postdecrement value is "+j);
		System.out.println("During the postdecrement the decrement was occurs after process execution "+x);
		
	}


}
