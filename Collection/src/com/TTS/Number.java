package com.TTS;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Number {

	public static void main(String[] args) {
		//求10000次中，1-20出現多少次
		Random random = new Random(40);
		//40只是種子數，為指定隨機數，亂打就可以了
	Map<Integer,Integer>m = new HashMap<Integer,Integer>();
	for(int i = 0;i < 10000; i ++) {
		int r  = random.nextInt(20);
		Integer f = m.get(r);
//  m.put(r, f == null ? 1 : f + 1); 
		if(f == null) {
			m.put(r,1);
		}
		else {
			m.put(r, f+1);
		}
		}
		System.out.println(m);
	}
}
//重複一萬次(r為1-20隨機數，f等於r數出現次數，當f不存在，f就是1，不然f就加一)