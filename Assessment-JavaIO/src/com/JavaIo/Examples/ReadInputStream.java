package com.JavaIo.Examples;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadInputStream {

	public static void main(String[] args) {
		try {
            InputStream ip = new FileInputStream("selfintor.txt");
            int i;
            while ((i = ip.read()) != -1) {
                System.out.print((char) i);
            }

            ip.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

	}

}
