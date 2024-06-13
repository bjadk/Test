package com.sun;

public class CalculateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate add = new Addition();
		Calculate subtract = new Subtraction();
		Calculate multiply = new Multiplication();
		Calculate divide = new Division();
		System.out.println("加算: " + add.Calculate(5, 3));
		System.out.println("減算: " + subtract.Calculate(5, 3));
		System.out.println("乗算: " + multiply.Calculate(5, 3));
		System.out.println("除算: " + divide.Calculate(6, 3));
	}

}
