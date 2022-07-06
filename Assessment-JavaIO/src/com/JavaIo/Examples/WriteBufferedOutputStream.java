package com.JavaIo.Examples;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class WriteBufferedOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hi I am Gnanamoorthy, I am From Thirukovilure, I am B.E Graduate";
        try {
            FileOutputStream op = new FileOutputStream("selfintro.txt");
            BufferedOutputStream bop = new BufferedOutputStream(op);
            byte[] arr = s.getBytes();
            bop.write(arr);
            bop.close();
            op.close();
            System.out.println("Data is written to the file.");

        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
