package com.Array.Example;

import java.util.Arrays;
import java.util.Scanner;

public class SearchSpecificValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		System.out.println("Enter the value what you are searching for: ");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		boolean isValue = false;
		for(int i=0;i<arr.length;i++) {
			if(index==arr[i]) {
				isValue=true;
			}else {
				isValue=false;
			}
		}
		if(isValue) {
			System.out.println(index+" was present in the array");
		}else {
			System.out.println(index+" was not present in the array");
		}

	}

}
