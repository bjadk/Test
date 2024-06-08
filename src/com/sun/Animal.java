package com.sun;

/**
 * 動物園の動物を管理するシステムを設計してください。
 * 
 * このシステムでは、動物（Animal）クラスと動物園（Zoo）クラスの2つが必要です。Animalクラスには、種類（species）、年齢（age）、健康状態（healthStatus）といったプライベート属性を設定します。Zooクラスでは、動物を配列で管理し、動物を追加、表示するメソッドを実装します。配列のサイズは固定であるため、最大動物数を設定してください。
 * 
 * 
 * 
 * 
 */

public class Animal {
	private String Animal;
	private int age;
	private String healthStatus;

	public String getAnimal() {
		return Animal;
	}

	public void SetAnimal(String Animal) {
		this.Animal = Animal;

	}

	public int getAge() {
		return age;

	}

	public void SetAge(int age) {
		this.age = age;
	}

	public String getHealthStatus() {
		return healthStatus;
	}

	public void SetHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}

}
