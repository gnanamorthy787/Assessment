package com.Exception.Example;

public class NumFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JamesBond007";
        try {
            int x = Integer.parseInt(str);
            int y = Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException occurs");
            e.printStackTrace();
        }

	}

}
