package com.Array.Example;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		System.out.println("difference Between smaleest and largest value:");
		difference(arr);

	}
	static void difference(int[] arr) {
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}else if(min>arr[i]) {
				min=arr[i];
			}
		}
		int difference=max-min;
		System.out.println(difference);
	}

}
