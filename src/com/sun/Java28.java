package com.sun;

/**
 * 整数の配列が与えられた場合に、その配列内に重複する要素を検出し、
 * それぞれの重複要素を一度だけ出力してください。配列はハードコーディングされているものとします。
 * 
 * 
 */

public class Java28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 1, 2, 3, 2, 4, 5, 1, 6 };
		boolean[] isDuplicate = new boolean[array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j] && !isDuplicate[i]) {
					isDuplicate[j] = true;
					System.out.println(array[i]);
				}

			}

		}
	}
}
