package com.sun;

/**
 * 
 * キーボードから6つの整数を入力し、それらを配列に格納した後、配列の中で最大値と最小値を見つけて出力するプログラムを書いてください。
 * 最大値と最小値が同じ値であれば、その値を一度だけ出力します。最大値と最小値が異なる値で、それぞれの値が複数存在する場合でも、各値を一度だけ出力します。
 */

public class Java23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 5, 7, 33, 7, 1, 9 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			int number = array[i];

			if (number > max) {
				max = number;
				if (number < min) {
					min = number;
				}

			}
		}
		System.out.println("max" + max);
		System.out.println("min" + min);

	}

}
