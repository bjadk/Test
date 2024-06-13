package com.sun;

/**
 * 「スマートデバイス」の抽象クラスと、インターフェース「コントロール可能」を作成します。抽象クラス「スマートデバイス」には、デバイス名を格納する属性と、
 * デバイス情報を出力する抽象メソッドを含めてください。
 * インターフェース「コントロール可能」には、デバイスをオンまたはオフにするメソッドを定義します。派生クラス「スマートライト」、
 * 「スマートサーモスタット」を作成し、これらのクラスで「スマートデバイス」の抽象メソッドを実装し、
 * 「コントロール可能」インターフェースのメソッドをオーバーライドしてください。
 * 
 * 
 */
public abstract class SmartDevice {
	String deviceName;

	abstract void display();

}

interface Controllable {
	void trunOn();

	void trunOff();
}

class SmartLight extends SmartDevice implements Controllable {

	@Override
	public void trunOn() {
		// TODO Auto-generated method stub
		System.out.println("ライトをオンにしました。");
	}

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("ライトをオフにしました。");
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("デバイス: " + deviceName);
	}

}

class SmartThermostat extends SmartDevice implements Controllable {

	@Override
	public void trunOn() {
		// TODO Auto-generated method stub
		System.out.println(" サーモスタットをオンにしました。");
	}

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("サーモスタットをオフにしました。");
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("デバイス: " + deviceName);
	}
}
