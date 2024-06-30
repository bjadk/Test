package com.sun;

/**
 * 自動車とトラックを表現するクラスを作成してください。
 * 
 * Carクラスを作成します。このクラスには、speed（速度）というint型のフィールドがあります。
 * Carクラスには、速度を設定するsetSpeedメソッドと、現在の速度を表示するshowSpeedメソッドがあります。
 * TruckクラスをCarクラスから派生させ、追加のフィールドloadCapacity（積載量）を持たせます。
 * Truckクラスには、積載量を設定するsetLoadCapacityメソッドと、積載量を表示するshowLoadCapacityメソッドを追加します。
 * 
 * 
 */
public class SmallCar {

	int speed;

	public void setSpeed(int speed) {
		this.speed = speed;

	}

	public void showSpeed() {
		System.out.println("speed: " + speed);
	}

}

class Tuck extends SmallCar {
	int loadCapacity;

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void showSpeed( ) {
		System.out.println( "speed: "+ speed);
	}

	public void setloadCapacity(int loadCapacity) {
		this.loadCapacity  =loadCapacity;
	}
	public void showLoadCapacity() {
		System.out.println(" loadCapacity: " + loadCapacity);
	}
	
		
	}

