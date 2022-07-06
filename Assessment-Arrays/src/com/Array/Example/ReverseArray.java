package com.Array.Example;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		System.out.println("Original array:"+Arrays.toString(a));
		reverse(a);

	}
	static void reverse(int[] rev) {
		int[] r_arr = new int[rev.length];
		int len=(rev.length);
		for(int i=0;i<rev.length;i++) {
			r_arr[i]=rev[len-1];
			len=len-1;

		}
		System.out.println("Reversed array:"+Arrays.toString(r_arr));
	}

}
