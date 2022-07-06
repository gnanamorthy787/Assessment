package com.String.Examples;

public class Spliting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Gnana moorthy";
        String[] spl = name.split(" ");
        for (String i : spl) {
            System.out.println("Splitted : " + i);
        }

	}

}
