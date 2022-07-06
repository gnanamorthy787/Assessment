package com.Array.Example;

public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add,average;
		int[] arr= {10,20,30,40,50};
		System.out.println("sum of values of an array: "+addArrayIntegers(arr));
		add=addArrayIntegers(arr);
		average=add/arr.length;
		System.out.println("Average Value of Array is:"+average);

	}
	static int addArrayIntegers(int[] a) {
		int j=0;
		for(int i=0;i<a.length;i++) {
			j=j+a[i];
		}
		return j;
	}

}
