package com.TTS;



public class Score {
	int value;
	Score (String s) throws RangeException{

		try {
	value = Integer.parseInt(s);
		}catch(NumberFormatException e) {
			if(value<0||value>100)
			 throw new RangeException();
			return ;
		}
	}
}
