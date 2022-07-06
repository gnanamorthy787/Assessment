package com.Array.Example;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,1,2};
		System.out.println("Array:"+Arrays.toString(arr));
		System.out.println("Duplicate Values:");
		duplicate(arr);
		

	}
	static void duplicate(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if((a[i]==a[j])&&(i!=j)) {
					System.out.println(a[j]+" ");
				}
			}
		}
	}

}
