package com.TTS;

import java.io.*;

public class InputstreamReader {

	public static void main(String[] args) {
		try {
	FileInputStream fis = new FileInputStream("abc.txt");
	Reader in =new InputStreamReader(fis);
	int n = in.read();
    while(n!=-1){
        System.out.print((char)n);
        n = in.read();
	 
    }
		}catch (Exception e) {
			e.getStackTrace();
		}
		

	}

}
