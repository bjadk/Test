package com.sun;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Electronics electronics = new Electronics();
//		electronics.setManufacturer("apple");
//		electronics.setName("iphone");
//		electronics.setPrice(80000);
//		electronics.showManufacturer();
//		electronics.showName();
//		electronics.showPrice();
//		electronics.display();
		Food food = new Food();
		food.setName("chocolate");
		food.setPrice(200);
		food.setExpiryDate("2023年2月");
		food.showName();
		food.showPrice();
		food.showExpriryDate();

	}
}
