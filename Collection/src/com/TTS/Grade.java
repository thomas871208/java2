package com.TTS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入數學成績");
		int math = Integer.parseInt(scanner.nextLine());
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("請輸入英文成績");
		int english = Integer.parseInt(scanner1.nextLine());
		int average = (math+english)/2;
		System.out.println("平均成績為:" + average);
	}catch (ArithmeticException e) {
		System.out.println("成績不能為0");
	}catch (InputMismatchException e) {
		System.out.println("成績格式錯誤");
	}
	}
}
