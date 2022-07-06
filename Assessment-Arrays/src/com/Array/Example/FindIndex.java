package com.Array.Example;

import java.util.Arrays;
import java.util.Scanner;

public class FindIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		System.out.println("Select the value what you need index: "+Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		int index = sc.nextByte();
		for(int i=0;i<arr.length;i++) {
			if(index==arr[i]) {
				System.out.println("Index of "+index+" is "+i);
			}
		}

	}

}
