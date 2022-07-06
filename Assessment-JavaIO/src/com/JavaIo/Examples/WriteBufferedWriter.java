package com.JavaIo.Examples;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteBufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hi I am Gnanamoorthy, I am From Thirukovilure, I am B.E Graduate";
		try {
            FileWriter fw = new FileWriter("selfintro.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(s);
            bw.close();
            fw.close();
            System.out.println("Data is written to the file.");

        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
