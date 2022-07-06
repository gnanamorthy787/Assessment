package com.Loops.Examples;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter any Number : ");
	    int ip = sc.nextInt();
	    boolean isprime=true;
	    
	    for(int i=2;i<ip;i++) {
	    	if(ip%i==0) {
	    		isprime=false;
	    	}
	    }
	    if(isprime) {
	    	System.out.println(ip+" is a prime number");
	    }else {
	    	System.out.println(ip+" is not a prime number");
	    }

	}

}
