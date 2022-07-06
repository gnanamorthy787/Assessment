package com.Array.Example;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		System.out.println("Even numbers are:");
		even(arr);
		System.out.println("odd numbers are:");
		odd(arr);	
	}
	static void even(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" ");
			}
		}
	}
	static void odd(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]+" ");
			}
		}
	}

}
