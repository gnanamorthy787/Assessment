package com.JavaIo.Examples;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Written using OutputStream.Hi I am Gnanamoorthy, I am From Thirukovilure, I am B.E Graduate";

        try {
            OutputStream op = new FileOutputStream("selfintor.txt");
            byte[] db = data.getBytes();
            op.write(db);
            System.out.println("Data is written to the file.");
            op.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

	}

}
