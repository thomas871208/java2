package com.TTS;
import java.util.HashSet;
public class Set {

	public static void main(String[] args) {
		System.out.println("我要調查你們十人的興趣有哪些");
		HashSet set= new HashSet();
		String p1 = new String ("逛街");
		String p2 = new String ("打球");
		String p3 = new String ("看電視");
		String p4 = new String ("打球");
		String p5 = new String ("看書");
		String p6 = new String ("打球");
		String p7 = new String ("看電視");
		String p8 = new String ("逛街");
		String p9 = new String ("睡覺");
		String p10 = new String ("睡覺");
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		set.add(p7);
		set.add(p8);
		set.add(p9);
		set.add(p10);
		System.out.println(set);

	}

}
