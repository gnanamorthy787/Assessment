package com.JavaIo.Examples;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ReadBufferedInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            FileInputStream ip = new FileInputStream("selfintro.txt");
	            BufferedInputStream bip= new BufferedInputStream(ip);

	            int i;
	            while ((i = bip.read()) != -1) {
	                System.out.print((char) i);
	            }
	            bip.close();
	            ip.close();

	        } catch (Exception e) {
	            e.getStackTrace();
	        }

	}

}
