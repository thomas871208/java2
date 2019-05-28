package com.TTS;

public class RunningHorse {

	public static void main(String[] args) {
/*		Horse horse = new Horse();
		horse.start();
		
		Horserunnable hr = new Horserunnable();
		Thread thread = new Thread(hr);
		thread.start();
		System.out.println("Main End");*/
		
		Horse h1 = new Horse("Horse1 :");
		h1.start();
		Horse h2 = new Horse("Horse2 :");
		h2.start();

	}

}
