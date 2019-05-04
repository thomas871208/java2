package com.TTS;
public class Score {
	int value;
	Score (String s) throws ScoreFormatException{

		try {
	value = Integer.parseInt(s);
		}catch(NumberFormatException e) {
			 throw new ScoreFormatException();
		}
	}
}
