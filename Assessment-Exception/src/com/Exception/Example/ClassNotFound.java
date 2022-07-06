package com.Exception.Example;

public class ClassNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        try {
            Class.forName("com.Exception.Example");
            ClassLoader.getSystemClassLoader().loadClass("com.Exception.Example");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

	}

}
