package com.sun;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new Bike();
		vehicles[1] = new Car();
		for (Vehicle vehicle : vehicles) {
			vehicle.Move();

		}

	}

}
