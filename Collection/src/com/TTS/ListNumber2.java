package com.TTS;

import java.util.ArrayList;
import java.util.Random;

public class ListNumber2 {
//求10000次中，1-20出現多少次
	public static void main(String[] args) {
		Random random = new Random(40);
		ArrayList<Integer> a = new ArrayList<>();
		int[]f = new int [20];
		for(int i = 0; i<10000; i++) {
			int r = random.nextInt(20);
			a.add(r);
			f[r]++;
			
		}
		for (int q =0;f.length>q;q++) {
			System.out.println(q +"="+f[q]);
		}
	}
}
//先設[]有20個，重複一萬遍(設r是1-20隨機數，抽到一個r數，該r數的[]就加一)，最後印出20次20個數個有多少