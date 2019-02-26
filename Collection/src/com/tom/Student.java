package com.tom;

public class Student {

	protected String name;
	private int english;

	public Student(String name, int english) {
		this.name = name;
		this.english = english;
	}

	public void print() {
		System.out.println(name + "\t" + english);
	}
	
	public void SetEnglish(int english) {
		if(english >= 0 && english <= 100) {
			this.english = english;
		}
	}
}
