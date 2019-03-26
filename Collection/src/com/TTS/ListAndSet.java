package com.TTS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ListAndSet {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(85);
		a.add(86);
		a.add(87);
		a.add(88);
		a.add(88);
		a.add(88);
		System.out.println(a);
//		ArrayList<Integer> b = Arrays.asList(85,86,87,88,88,88).
//		System.out.println(b);
		
		Set set= new HashSet();
		String b1 = new String ("杜豐于");
		String b2 = new String ("杜美心");
		String b3 = new String ("鞏俐芳");
		String b4 = new String ("杜美心");
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		System.out.println(set);
		System.out.println(set.size());
		
	}

}
