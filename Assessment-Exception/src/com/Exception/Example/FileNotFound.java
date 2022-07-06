package com.Exception.Example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      try {
	            BufferedReader reader = new BufferedReader(new FileReader(new File("/invalid/file/location")));
	        }
	        catch (FileNotFoundException e) {
	            System.err.println("FileNotFoundException caught!");
	            e.printStackTrace();
	        }

	}

}
