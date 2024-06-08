package com.sun;

/**
 * 整数の配列のすべての要素の合計を計算するメソッドsumArrayを作成してください。
 * 
 */

public class Java35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 6, 7, 8 };
		System.out.println(sumArray(array));
	}

	public static int sumArray(int[] array) {
		int sum = 0;
		for (int number : array) {
			sum += number;

		}
		return sum;

	}
}	
