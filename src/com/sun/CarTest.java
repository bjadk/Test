package com.sun;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java46Car car = new Java46Car();
		car.setModel("Toyota");
		car.setMaxSpeed(180);
		System.out.println(car.getModel());

		System.out.println(car.getMaxSpeed());
		Java46Car car2 = new Java46Car();
		car2.setMaxSpeed(190);
		System.out.println(car2.getMaxSpeed());
	}

}
