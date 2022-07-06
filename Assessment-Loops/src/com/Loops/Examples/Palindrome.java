package com.Loops.Examples;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter any Number : ");
	    int ip = sc.nextInt();
	    int temp=ip;
	    int result=0;
	    while(ip!=0) {
	    	int last=ip%10;
	    	result=(result*10)+last;
	    	ip=ip/10;
	    }
	    if(temp==result) {
	    	System.out.println(temp+" is a palindrome number");
	    }else{
	    	System.out.println(temp+" is not a polindrome number");
	    }
	}

}
