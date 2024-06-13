package com.sun;

public class MediaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Music music = new Music();
		music.length = 70;
		music.title = "Beethoven - Symphony No.9";
		Vido vido = new Vido();
		vido.title = "Spirited Away";
		vido.length = 125;
		music.displayinfo();
		music.play();
		vido.displayinfo();
		vido.play();

	}

}
