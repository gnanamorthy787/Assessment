package com.JavaIo.Examples;

import java.io.FileReader;

public class ReadFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            FileReader fr = new FileReader("selfintro.txt");
	            int i;
	            while ((i = fr.read()) != -1) {
	                System.out.print((char) i);
	            }
	            fr.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	}

}
