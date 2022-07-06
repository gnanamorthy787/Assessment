package com.Array.Example;

public class ConatainSpecificElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {11,12,17,23,25};
		int a=12,b=23;
		contains(arr,a,b);

	}
	static void contains(int[] arr,int a,int b) {
		boolean num1=false;
		boolean num2=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				num1=true;
			}
			if(arr[i]==b) {
				num2=true;
			}
		}
		if(num1) {
			System.out.println(a+" present in the array");
		}
		if(num2) {
			System.out.println(b+" present in the array");
		}
	}

}
