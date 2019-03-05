package com.TTS;

public class Gun {
		protected String type;
		protected int damage;
		public Gun (String type, int damage) {
			this.type = type;
			this.damage = damage;
		}
		public void print() {
			System.out.println( type + "\t" + damage);
		}
}
