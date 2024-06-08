package com.sun;

import java.util.Scanner;

public class Tes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[] { 1, 3, 5, 7, 100, 0, 1 };
		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			int number = array[i];

			if (number > max) {
				max = number;

			}
			if (number < min) {
				min = number;
			}

		}
		System.out.println("max" + max);
		System.out.println("min" + min);
	}

}
