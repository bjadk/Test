package com.sun;

/**
 * 「メディア」の抽象クラスと、インターフェース「再生可能」を作成します。抽象クラス「メディア」には、基本情報（例えば、タイトルや長さ）を格納する属性と、
 * これらの情報を出力する抽象メソッドを含めてください。インターフェース「再生可能」には、メディアを再生するメソッドを定義します。派生クラス「音楽」と「ビデオ」を作成し、
 * これらのクラスで「メディア」クラスの抽象メソッドを実装し、「再生可能」インターフェースのメソッドをオーバーライドしてください。
 * 
 * 
 */

public abstract class Media {
	String title;
	int length;

	abstract void displayinfo();

}

interface Playable {
	void play();

}

class Music extends Media implements Playable {

	@Override
	void displayinfo() {
		System.out.println("音楽「" + title + "」, 長さ: " + length + "分");

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("再生中: " + title);

	}

}

class Vido extends Media implements Playable {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("vido 『"+title+"』,長さ :"+length +"");
	}

	@Override
	void displayinfo() {
		// TODO Auto-generated method stub
		System.out.println("再生中"+title);
	}

}
