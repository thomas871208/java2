package com.TTS;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
	Map map = new HashMap<>();
	while(true) {	
	int value = 0;
	System.out.println("請輸入物品按Enter後輸入數量");
	System.out.println("輸入bye結束程式");
	Scanner scanner = new Scanner(System.in);
	String shop =scanner.nextLine();
	if(shop.equals("bye")) {
		break;
	}
	else {

	Scanner s = new Scanner(System.in);
	int f = scanner.nextInt();
	System.out.println("代購清單:");
	map.put(shop, value + f);
	System.out.println(map);
	}	
	}
	}

}
