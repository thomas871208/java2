package com.TTS;

public class BrushingTeeth extends Thread{

	@Override
	public void run() {
		try {
		System.out.println("刷牙");
		sleep(2000);
		System.out.println("刷完牙");
		}catch(Exception e){
		e.printStackTrace();
		}		
		super.run();
	}
	
}
