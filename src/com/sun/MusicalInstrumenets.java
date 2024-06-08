package com.sun;

/**
 * 「楽器」基底クラスと、その派生クラス「ギター」と「ピアノ」を作成します。基底クラスには抽象メソッドplay()を定義し、
 * 派生クラスでこのメソッドを実装してください。それぞれの楽器で異なる音を出すようにし、多様性を示す簡単なプログラムを作成します。
 */

public abstract class MusicalInstrumenets {
 String name;
 String sound;
 public void setName( String name) {
	 this.name= name;
 }
 public void showName() {
	 System.out.println("Name: "+name);
 }
 public void setSound( String sound) {
	 this.sound =sound;// mmm
 }
	
	}


