package com.Array.Example;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		System.out.print("Select an index to remove a value from arr = " +Arrays.toString(arr)+ ": ");
        // Get the specific index
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        // Print the index at which value is removed
        System.out.println("Array after removing Element at index " + index );
        if (arr == null || index < 0 || index >= arr.length) {
            System.out.println("Check value");
        }
        int[] anotherArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
        	if (i == index) {
                continue;
            }
        	anotherArray[k++] = arr[i];
        }
        System.out.println(Arrays.toString(anotherArray));
        

	}

}
