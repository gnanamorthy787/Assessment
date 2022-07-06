package com.JavaIo.Examples;

import java.io.FileWriter;

public class WriteFileWriter {

	public static void main(String[] args) {
		String s = "Hi I am Gnanamoorthy, I am from Thirukovilure, I am B.E graduate";

        try {
            FileWriter fw = new FileWriter("selfintro.txt");
            fw.write(s);
            fw.close();
            System.out.println("Data is written to the file.");

        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
