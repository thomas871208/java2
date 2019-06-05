package com.TTS;

public class Wizard extends Thread{
	public synchronized void Thunder(){
		System.out.println("thunder start");
		try {
			sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("thunder end");		
	}
	public void run() {
		Thunder();
	}
	
	
	public static void main(String[] args) {
	Wizard wizard = new Wizard();
	Thread t1 = new Thread(wizard);
	Thread t2 = new Thread(wizard);
	t1.start();
	t2.start();
			

	}
	
}
