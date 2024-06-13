package com.sun;

/**
 * 基底クラス「交通手段」を作成し、その派生クラスとして「自動車」と「自転車」を定義します。基底クラスには、 move()という抽象メソッドを持ち、
 * 各派生クラスでこのメソッドを異なる方法で実装してください。move()メソッドは、 その交通手段の移動方法を示すメッセージを出力するものとします。
 * 
 * 
 */
abstract class Vehicle {
	abstract void Move();

}
class Bike extends Vehicle{

	@Override
	void Move() {
		System.out.println( "自行车道路");
		
	}
}
	class Car extends Vehicle{

		@Override
		void Move() {
			System.out.println( "自动车道路");
			
		}
		
	}