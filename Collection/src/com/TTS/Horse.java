package com.TTS;

public class Horse extends Thread{
/*
	@Override
	public void run() {
		for(int i=1;i<=1000;i++) {
		System.out.println("horse2:  "+i);	
		}
		super.run();
	}

	*/
	@Override
	public void run() {
		for(int i=1;i<=1000;i++) {
		System.out.println(getName()+i);	
		}
		try {
			sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		super.run();
	}
	
	public Horse(String name) {
	setName(name);
	}
}


