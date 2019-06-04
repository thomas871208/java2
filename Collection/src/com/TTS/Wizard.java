package com.TTS;

public class Wizard extends Thread{
	private void Thunder(){
		System.out.println("thunder start");
		try {
			sleep(1000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("thunder end");		
	}
	public void run() {
		Thunder();
	}
	
	
	public static void main(String[] args) {
	Wizard w1 = new Wizard();
	Wizard w2 = new Wizard();
	w1.start();
	w2.start();
			

	}
	
}
