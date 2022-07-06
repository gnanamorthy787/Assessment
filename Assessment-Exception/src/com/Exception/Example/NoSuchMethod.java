package com.Exception.Example;

import java.lang.reflect.Method;

public class NoSuchMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            Class c = Class.forName("com.Exception.Example");
	            Method m = c.getDeclaredMethod("subtraction", int.class, int.class);
	        }
	        catch (NoSuchMethodException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }

	}

}
class E_14 {
    //creating a method which receives two integer values as parameters
    public void addition(int a, int b) {
        int c;
        c = a + b;
        System.out.println(c);
    }
}
