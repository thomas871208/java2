package com.TTS;

import java.io.*;
import java.io.FileReader;

public class Taiwan {

	public static void main(String[] args) {
		try{
	BufferedReader in = new BufferedReader(new FileReader("Data.txt"));
	String line = in.readLine();
	while(line!=null){
		System.out.println(line);
//		String[] tokens =line.split(",");
//		System.out.println(tokens[0] + tokens[1]+tokens[2]);
	}
	}catch(IOException e) {
		e.getStackTrace();
	}
		
	}
}
