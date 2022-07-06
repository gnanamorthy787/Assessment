package com.Array.Example;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you want in array:");
		int n=sc.nextInt();
		System.out.println("Enter the elements of an array:");
		int[] elements=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println();
			elements[i]=sc.nextInt();
		}
		int[] copied=elements;
		System.out.println("copied array:");
		for(int i=0;i<copied.length;i++) {
			System.out.println(copied[i]);
		}

	}

}
