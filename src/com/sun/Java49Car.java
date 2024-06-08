package com.sun;

/*自動車とトラックを表現するクラスを作成してください。

Carクラスを作成します。このクラスには、speed（速度）というint型のフィールドがあります。
Carクラスには、速度を設定するsetSpeedメソッドと、現在の速度を表示するshowSpeedメソッドがあります。
TruckクラスをCarクラスから派生させ、追加のフィールドloadCapacity（積載量）を持たせます。
Truckクラスには、積載量を設定するsetLoadCapacityメソッドと、積載量を表示するshowLoadCapacityメソッドを追加します。
 *
 */

public class Java49Car {
	int speed;

	public void showSpeed() {
		System.out.println(" Speed: " + speed);
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
//
//	public int getSpeed() {
//		return speed;
//	}
//
//	public void showSpeed() {
//		System.out.println();
//	}
}

class Truck extends Java49Car {
	int loadCapacity;

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	public void showLoadCapacity() {
		System.out.println(" LoadCapacity: " + loadCapacity);

	}

}
