package com.TTS;

public class RangeException extends Exception{

	@Override
	public String getMessage() {
		
		return "數學成績不能小於零或大於一百";
	}


}
