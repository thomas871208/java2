package com.TTS;

import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;

public class Taiwan {

	public static void main(String[] args) {

		ArrayList<String>cities = new ArrayList<>();
		ArrayList<String>areas = new ArrayList<>();
		ArrayList<String>postcode = new ArrayList<>();
		String lastcity ="";
		try{
	BufferedReader in = new BufferedReader(new FileReader("Data.txt"));
	String line = in.readLine();

	while(line!=null){
//		System.out.println(line);
		String[] tokens =line.split(",");
		if(!tokens[0].equals(lastcity)) {
			lastcity = tokens[0];
			cities.add(lastcity);
		}
		areas.add(tokens[1]);
		postcode.add(tokens[2]);
		line = in.readLine();
	}
	System.out.println( cities);

	}catch(Exception e) {
		e.getStackTrace();
	}
		
	}
}
