package com.Array.Example;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementAtSpecificPositiom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr= {2,3,4,5,6};
		System.out.println("Enter the position where you want to insert element:");
		int position=sc.nextInt();
		System.out.println("Enter the element what you want to insert:");
		int element=sc.nextInt();
		arr[position]=element;
		System.out.println(Arrays.toString(arr));
		
		

	}

}
