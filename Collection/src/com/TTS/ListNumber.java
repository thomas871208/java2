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
	

	for(int i = 0;i<10000;i++) {
			int r =random.nextInt(20);
			Integer f = a.get(r);
			a.set(r,f+1);
	}
	
	System.out.println(a);
	

	

}
}