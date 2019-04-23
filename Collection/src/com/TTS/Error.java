package com.TTS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Error {

	public static void main(String[] args) {
		int money =100000;
		System.out.print("請輸入人數");
		try {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("每人得" + money/n + "元");
		}catch (ArithmeticException e) {
		System.out.println("資料不能為0");
		}catch (InputMismatchException e) {
			System.out.println("資料格式錯誤");
		}catch (Exception e) {
			System.out.println("資料錯誤");
		}
		
		//輸入0會得Exception in thread "main" java.lang.ArithmeticException: / by zero
		/*輸入5v或0.1會得Exception in thread "main" java.util.InputMismatchException
		at java.util.Scanner.throwFor(Unknown Source)
		at java.util.Scanner.next(Unknown Source)
		at java.util.Scanner.nextInt(Unknown Source)
		at java.util.Scanner.nextInt(Unknown Source)*/
		/*輸入66666666666666666666666666666666666 會得到
		Exception in thread "main" java.util.InputMismatchException: For input string: "66666666666666666666666666666666666"
		at java.util.Scanner.nextInt(Unknown Source)
		at java.util.Scanner.nextInt(Unknown Source)
		 */
	}

}
