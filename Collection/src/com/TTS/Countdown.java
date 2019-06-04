package com.TTS;


public class Countdown{

	public static void main(String[] args) {
		System.out.println("起床");
		BrushingTeeth bt = new BrushingTeeth();
		bt.start();

		MakingBreakfast mb = new MakingBreakfast();
		Thread thread = new Thread(mb);
		thread.start();
		try {
		bt.join();	
		thread.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("完畢");
	}

}
