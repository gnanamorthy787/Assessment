package com.Array.Example;

public class AddArrayInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		System.out.println(addArrayIntegers(arr));
		

	}
	static int addArrayIntegers(int[] a) {
		int j=0;
		for(int i=0;i<a.length;i++) {
			j=j+a[i];
		}
		return j;
	}

}
