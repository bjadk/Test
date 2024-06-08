package com.sun;

/**
 * 車（Car）クラスを作成してください。このクラスには、最高速度（maxSpeed）と車種（model）という2つのプライベート属性が必要です。
 * カプセル化の原則に従い、これらの属性にアクセスするための公開メソッド（ゲッターとセッター）を実装してください。
 * 
 * 
 */

public class Java46Car {

	String model;
    int maxSpeed;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

//	public String getModel() {
//		return model;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}
//
//	public int getMaxSpeed() {
//		return maxSpeed;
//	}
//
//	public void setMaxSpeed(int maxSpeed) {
//		this.maxSpeed = maxSpeed;
	}
