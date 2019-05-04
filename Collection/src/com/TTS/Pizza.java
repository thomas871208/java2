package com.TTS;

import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
	int p;
	try {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Pizza要切成幾塊?");	
	p = Integer.parseInt(scanner.nextLine());
	if(p==0) {
	System.out.println(RangeTest1(p));
	}
	else if((p>0 && p<8)||(p>8 &&p<12)||(p>12 && p<16)) {
	System.out.println(RangeTest2(p));
	}
	else if (p<0||p>16) {
	System.out.println(RangeTest3(p));
	}
	else if (p==8 ||p==12 || p==16) {
	System.out.println(RangeTest4(p));
	}
	}catch(ArithmeticException e){
		System.out.println(e.getMessage());
	}catch (Exception e) {
		System.out.println("格式錯誤");
	}
}
	public static int RangeTest1(int p) throws ArithmeticException{
		if (p==0)
		throw new ArithmeticException("你確定不用切?");
		return p;
	}
	public static int RangeTest2(int p) throws ArithmeticException{
		if ((p>0 && p<8)||(p>8 &&p<12)||(p>12 && p<16))
		throw new ArithmeticException("數量錯誤");
		return p;
	}
	public static int RangeTest3(int p) throws ArithmeticException{
		if (p<0||p>16)
		throw new ArithmeticException("超出範圍");
		return p;
	}
	public static int RangeTest4(int p) throws ArithmeticException{
		if (p==8 ||p==12 || p==16)
		throw new ArithmeticException("謝謝選購");
		return p;
	}
}
