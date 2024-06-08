package com.sun;

import java.util.Scanner;

/***
 * Javaの main メソッド内で、0と1が混在する整数配列が与えられた場合に、
 * 各要素について最も近い0までの距離を計算して新しい配列として出力してください。距離はインデックスの差で測ります。
 * 配列はハードコーディングされているものとします。
 * 
 * 
 * 
 * 
 */

public class Java30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 1, 0, 2, 1, 0, 1, 2, 3, 4 };
		int[] distances = new int[array.length];
		int lastZero = Integer.MAX_VALUE / 2;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				lastZero = i;
			}
			distances[i] = i - lastZero;
			System.out.println(distances[i]);

		}
	}
}
