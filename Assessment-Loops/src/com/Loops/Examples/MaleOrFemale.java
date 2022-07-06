package com.Loops.Examples;

import java.util.Scanner;

public class MaleOrFemale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the gender as M/F: ");
	    char gender = sc.next().charAt(0);
	    switch(gender) {
	    case 'M':
	    	System.out.println("Gender is Male");
	    	break;
	    case 'F':
	    	System.out.println("Gender is Female");
	    	break;
	    }

	}

}
