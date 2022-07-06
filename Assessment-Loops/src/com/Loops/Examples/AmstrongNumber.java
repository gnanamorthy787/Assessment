package com.Loops.Examples;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter any Number : ");
	     int ip = sc.nextInt();
	     int temp=ip;
	     int result=0;
	     
	     while(ip>0) {
	    	 int last=ip%10;
	    	 result=result+(last*last*last);
	    	 ip=ip/10;
	     }
	     if(temp==result) {
	    	 System.out.println(temp+" is a amstrong number");
	     }else {
	    	 System.out.println(temp+" is a not amstrong number");
	     }

	}

}
