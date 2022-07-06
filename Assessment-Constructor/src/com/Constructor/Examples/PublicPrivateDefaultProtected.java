package com.Constructor.Examples;

public class PublicPrivateDefaultProtected {
	    int rollNo;
	    String name;
	    String clg;
	    String city;

	    {System.out.println("Student Details");}
	    PublicPrivateDefaultProtected() {
	        this(11);
	    }

	    public  PublicPrivateDefaultProtected(int rollNo) {
	        this("Sharan");
	        this.rollNo = rollNo;
	        System.out.println("rollNo : " + rollNo);
	    }

	    private  PublicPrivateDefaultProtected(String name) {
	        this("ICFAI", "Hyderabad");
	        this.name = name;
	        System.out.println("Name : " + name);
	    }

	    protected  PublicPrivateDefaultProtected(String clg, String city) {
	        this.clg = clg;
	        this.city = city;
	        System.out.println("college : " + clg);
	        System.out.println("City : " + city);
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PublicPrivateDefaultProtected c=new  PublicPrivateDefaultProtected();

	}

}
