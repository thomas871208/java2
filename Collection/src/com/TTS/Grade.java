package com.TTS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		int m;
		int eng;
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入數學成績");
		m = Integer.parseInt(scanner.nextLine());
		System.out.printf("數學成績為：%d\n", rangeTest1(m));
		System.out.println("請輸入英文成績");
		eng = Integer.parseInt(scanner.nextLine());
		System.out.printf("英文成績為：%d\n", rangeTest2(eng));
		int average = (m+eng)/2;
		System.out.println("平均成績為:" + average);
	}catch (ArithmeticException e) {
		System.out.println(e.getMessage());
	}catch (InputMismatchException e) {
		System.out.println("成績格式錯誤");
	}catch (NumberFormatException e) {
		System.out.println("成績格式錯誤");
    }catch (Exception e) {
    	System.out.println("輸入錯誤");
    }

	}
	public static int rangeTest1(int m) throws ArithmeticException{
		if (m<0||m>100) 
			throw new ArithmeticException("數學成績不能小於零或大於一百");
			return m;
	}
	public static int rangeTest2(int eng) throws ArithmeticException{
		if (eng<0||eng>100) 
			throw new ArithmeticException("英文成績不能小於零或大於一百");
			return eng;
	}
}