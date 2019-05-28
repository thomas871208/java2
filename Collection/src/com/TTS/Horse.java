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
		
		for(int i=1;i<=100;i++) {
			StringBuilder spaces = new StringBuilder();
			for(int j=0;j<i;j++) {
				spaces.append(" ");
			}
		System.out.println(spaces+getName()+i);	
			
		try {
			sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		super.run();
	}
	
	public Horse(String name) {
	setName(name);
	}
}


