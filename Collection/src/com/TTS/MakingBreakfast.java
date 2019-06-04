package com.TTS;

public class MakingBreakfast implements Runnable{
	public void run() {
		try {
		System.out.println("做早餐");
		Thread.sleep(2000);
		System.out.println("做完早餐");
		}catch(Exception e){
		e.printStackTrace();
	}
	}

		
}
