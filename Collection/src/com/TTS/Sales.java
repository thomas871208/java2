package com.TTS;

import java.io.*;

public class Sales {

	public static void main(String[] args) {
	try {
	FileInputStream fir = new FileInputStream("sales.txt");
	InputStreamReader isr = new InputStreamReader(fir);
	BufferedReader in = new BufferedReader(isr);
	String line = in.readLine();
	while(line != null) {
//		System.out.println(line);
		String[] a = line.split(" ");
		int b = Integer.parseInt(a[1]);
		if(a.length ==2) {
			if(b >= 0 &&b <= 10) {
			System.out.println(a[0]+" "+a[1]+"  獎金5000元");
			}
			else if(b >= 10 && b <= 15) {
			System.out.println(a[0]+" "+a[1]+"  獎金8000元");	
			}
			else if(b>15) {
			System.out.println(a[0]+" "+a[1]+"  獎金10000元");	
			}
		}

		
			
		line = in.readLine();
	}
	}catch(Exception e) {
		e.getStackTrace();
	}
	}

}
