package com.Loops.Examples;

import java.util.Scanner;

public class EvenOrOddUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter any Number : ");
	    int ip = sc.nextInt();
	    switch(ip%2) {
	    case 0:
	    	System.out.println(ip+" is even number");
	        break;
	    case 1:
	    	System.out.println(ip+" is a odd number");
	    }

	}

}
