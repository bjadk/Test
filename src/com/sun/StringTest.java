package com.sun;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9 };
		int number = 1;
		for (int x = 0; x < arr.length; x++) {

			number *= arr[x];
		}

		System.out.println(number);

	}

}