package com.String.Examples;

public class MethodsESEC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="String Characters";
		String s2="Methods Equals";
		boolean eic=s1.equalsIgnoreCase(s2);
		System.out.println("EqualsIgnorCase:"+eic);
		boolean sw=s1.startsWith("Str");
		System.out.println("Starts with:"+sw);
		boolean ew=s1.endsWith("ers");
		System.out.println("Ends with:"+ew);
		int cto=s1.compareTo(s2);
		System.out.println("Compare to:"+cto);
		
		
	}

}
