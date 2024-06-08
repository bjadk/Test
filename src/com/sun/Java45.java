package com.sun;

import java.lang.reflect.Array;

public class Java45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 11, 22, 33, 44, 55, 66 };
		int number = 44;
		boolean flag = contains(array, 44);
		System.out.println(flag);

	}

	public static boolean contains(int[] array, int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return true;
			}

		}
		return false;
	}
}
