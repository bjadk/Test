package com.sun;

/**
 * main メソッド内で、二次元配列の要素の合計を計算してください。二次元配列はハードコーディングされているものとします。
 * 
 * 
 */

public class Java25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++)

				sum += array[i][j];
			System.out.println(sum);
		}
	}

}
