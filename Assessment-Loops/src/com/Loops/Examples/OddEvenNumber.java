package com.Loops.Examples;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter any Number : ");
	     int ip = sc.nextInt();
	     even(ip);
	     odd(ip);

	}
	static void even(int a) {
		System.out.println("Even numbers upto "+a+" are ");
		for(int i=1;i<=a;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	static void odd(int a) {
		System.out.println("odd numbers upto "+a+" are ");
		for(int i=1;i<=a;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
