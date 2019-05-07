package com.TTS;

import java.io.*;

public class FileReader {

	public static void main(String[] args) {
	int a = Integer.parseInt("666");
	File file = new File("abc.txt");
	/*System.out.println(file.exists());
	System.out.println(file.mkdirs());
	System.out.println(file.isDirectory());
	System.out.println(file.delete());
	System.out.println(file.listFiles());*/
	
	
	/*System.out.println(file.exists());
	System.out.println(file.canExecute());
	System.out.println(file.getPath());
	System.out.println(file.getAbsolutePath());
	System.out.println(file.getFreeSpace());
	System.out.println(file.getTotalSpace());*/
	
	
	File d = new File("C:\\Intel");
	if(d.exists() && d.isDirectory()) {
		String[] files = d.list();
		for(String s :files) {
		System.out.println(s);
			
			
		}
	}
	
	File f = new File(d ,"aaa");
	System.out.println(f.mkdir());
	System.out.println(f.delete());
	
//新增多個資料夾	
//	File f = new File(d ,"aaa\\bbb\\ccc");
//	System.out.println(f.mkdirs());
	}
	
	

}
