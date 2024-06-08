package com.sun;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		System.out.println(number);
		String hello = "hello";
		String world = "world";
		System.out.println(hello + world);
		Double number1 = 12.34;
		int convertednumber1 = 12;
		System.out.println("12.34" + number + "12" + convertednumber1);
		int x = 5;
		int y = 10;
		System.out.println(x + y);
		int X = 20;
		int Y = 5;
		System.out.println(X + Y);
		System.out.println(X - Y);
		System.out.println(X * Y);
		System.out.println(X / Y);
		System.out.print(X % Y);
		int a = 5;
		int b = 10;
		System.out.println(+a + "" + b);
		int A = 5;
		if (A % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
			int price1 = 100;
			double discount = 0.9;
			if (price1 >= 100) {
				discount = 0.9;
				int finalAmount = (int) (price1 * discount);
				System.out.println(finalAmount);
				
				int age = 25;
				if (age <= 12) {
					System.out.println("child");
				} else if (age <= 19) {
					System.out.println("teenager");
				} else if (age <= 59) {
					System.out.println("aduilts");
				} else if (age >= 60) {
					System.out.println("elder");

					String grade = "A";

					switch (grade) {
					case "A":
						System.out.println("excellent");
						break;
					case "B":
						System.out.println("good");
						break;
					case "C":
						System.out.println("qualified");

	}

}
