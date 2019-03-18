package com.TTS;

import java.util.ArrayList;
import java.util.Random;

public class ListNumber {

	public static void main(String[] args) {
		Random random = new Random();
	ArrayList<Integer> a = new ArrayList<>();
	for(int q = 0 ;q <20;q++) {
		a.add(0);
	}
	//求10000次中，1-20出現多少次
		for(int i = 0;i<10000;i++) {
		int r =random.nextInt(20);
		Integer f = a.get(r);
		if(f == null) {
		a.set(r, 1);
		}
		else {
		a.set(r,f+1);	
		//a.set(r, f == null ? 1 : f + 1);
			}		
	}
	System.out.println(a);

}
}
//重複一萬次(r為1-20隨機數，f等於r數出現次數，當f不存在，f就是1，不然f就加一)