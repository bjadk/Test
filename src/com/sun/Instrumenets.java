package com.sun;

/**
 * 「楽器」基底クラスと、その派生クラス「ギター」と「ピアノ」を作成します。基底クラスには抽象メソッドplay()を定義し、
 * 派生クラスでこのメソッドを実装してください。それぞれの楽器で異なる音を出すようにし、多様性を示す簡単なプログラムを作成します。
 */

public abstract class Instrumenets {

	abstract void display();
}

class Guitar extends Instrumenets {

	@Override
	void display() {
		System.out.println("Playing the guitar");

	}

}

class Piano extends Instrumenets {

	@Override
	void display() {
		System.out.println("Playing the piano");

	}
}

//	public void play() {
//
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void showName() {
//		System.out.println("Name: " + name);
//	}
//
//	public void setSound(String sound) {
//		this.sound = sound;
//	}
//}
//
//class Guitar extends Instrumenets {
//	private String music;
//
//	public void setMusic(String music) {
//		this.music = music;
//	}
//
//	public void showMusic() {
//
//		System.out.println("music: " + music);
//	}

