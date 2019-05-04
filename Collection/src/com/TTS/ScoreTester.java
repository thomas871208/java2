package com.TTS;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	try{
		System.out.println("請輸入數學成績");
		Score math = new Score(scanner.nextLine());
		System.out.println("請輸入英文成績");
		Score english = new Score(scanner.nextLine());
		System.out.println((math.value + english.value)/2);
	}catch (ScoreFormatException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	}
}
