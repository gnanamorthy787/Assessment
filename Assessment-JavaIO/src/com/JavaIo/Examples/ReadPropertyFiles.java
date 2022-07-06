package com.JavaIo.Examples;

import java.io.FileOutputStream;
import java.util.Properties;

public class ReadPropertyFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Properties props = new Properties();
            props.put("Name", "Gnana");
            props.put("Age", "22");
            props.put("Sex", "Male");
            FileOutputStream outputStrem = new FileOutputStream("pf.txt");
            props.store(outputStrem, "This is a sample properties file");
            System.out.println("Properties file created");

        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
