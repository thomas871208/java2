package com.TTS;
import com.TTS.Gun;
import com.TTS.Knife;
public class Weapon {

	public static void main(String[] args) {
	Gun gun = new Gun("shotgun", 10);
	gun.print();
	Knife knife = new Knife();
	knife.print();
	}

}
