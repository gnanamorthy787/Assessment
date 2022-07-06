package com.Exception.Example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class GenerateIOException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File file = new File("selfintro.txt");
	     FileInputStream fis = null;
	     try {
	         fis = new FileInputStream(file);
	         fis.read();
	         fis.close();
	     }
	     catch (IOException e) {
	         e.printStackTrace();
	     }

	}

}
