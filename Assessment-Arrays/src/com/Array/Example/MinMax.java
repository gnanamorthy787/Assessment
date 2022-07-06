package com.Array.Example;

import java.util.Arrays;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		System.out.println("Values in array:"+Arrays.toString(arr));
		System.out.println("max Value in array:"+max(arr));
		System.out.println("min Value in array:"+min(arr));
		
		

	}
	static int max(int[] a){
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	static int min(int[] a){
		int min=a[4];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}

}
