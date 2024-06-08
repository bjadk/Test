package com.sun;

public class AniamlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		animal.SetAnimal("ライオン");
		animal.SetAge(5);
		animal.SetHealthStatus("健康");
		System.out.println(animal.getAnimal());
		System.out.println(animal.getAge());
		System.out.println(animal.getHealthStatus());
		Animal animal2 = new Animal();
		animal2.SetAnimal("ゾウ");
		animal2.SetAge(10);
		animal2.SetHealthStatus(" 病気");
		System.out.println(animal.getAnimal());
		System.out.println(animal.getAge());
		System.out.println(animal.getHealthStatus());
		
	}

}
