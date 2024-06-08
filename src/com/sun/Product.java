package com.sun;

/**
 * 「商品」基底クラスと、派生クラス「電子製品」と「食品」を作成します。基底クラスにはdisplay()メソッドを定義し、
 * 商品の基本情報を表示します。各派生クラスには特有の属性を追加し、display()メソッドをオーバーライドして商品の詳細情報を表示するようにします。
 * 
 * 
 */

public class Product {
	String name;
	int price;
	String manufacturer;

	public void showName() {
		System.out.println("name: " + name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showPrice() {
		System.out.println("price: " + price);
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

class Food extends Product {
	String expiryDate;

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public void showExpriryDate() {

		System.out.println("赏味期限：" + expiryDate);
	}

	void display() {
		System.out.println("赏味期限：" + expiryDate);
	}
}

//
//	public void display() {
//		System.out.println("显示产品详情。");
//	}
//}
//
//class Electronics extends Product {
//	String manufacturer;
//
//	public void setManufacturer(String manufacturer) {
//		this.manufacturer = manufacturer;
//	}
//
//	public void showManufacturer() {
//		System.out.println("manufacturer: " + manufacturer);
//	}
//
//	public void display() {
//		super.display();
//		System.out.println("製造元: " + manufacturer);
//
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void showName() {
//		System.out.println("name: " + name);
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//
//	public void showPrice() {
//		System.out.println("price: " + price);
//	}
//
//	public void setmanufacturer(String manufacturer) {
//		this.manufacturer = manufacturer;
//	}
//
//	public void showManufacturer() {
//		System.out.println("manufacturer: " + manufacturer);
//	}
//
//	void display() {
//		System.out.println("商品名："+name+"価格: "+price+"製造元: "+ manufacturer);
