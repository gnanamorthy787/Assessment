package com.Loops.Examples;

import java.util.Scanner;

public class EqualAndNotEqual {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
        System.out.print("Enter first number : ");
        // "nextInt()" scans the next token of the input as an Int.
        int a = num.nextInt();
        System.out.print("Enter second number : ");
        int b = num.nextInt();
        
        if(a==b) {
        	System.out.println("Both are equal");
        }
        if(a!=b) {
        	System.out.println("Both are not equal");
        }

	}

}
