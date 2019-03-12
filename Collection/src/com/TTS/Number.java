package com.TTS;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Number {

	public static void main(String[] args) {
		Random ramdom = new Random(40);
	Map<Integer,Integer>m = new HashMap<Integer,Integer>();
	for(int i = 0;i < 10000; i ++) {
		int r  = ramdom.nextInt(20);
		Integer f = m.get(r);
		if(f == null) {
			r= 1;
		}
		else {
			r=r+1;
		}
		System.out.println(m);
		
	}
	

	}

}
