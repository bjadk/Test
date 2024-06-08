package com.sun;

/***
 * 整数の配列が与えられた場合に、その配列内の「ピーク」要素を見つけ出してください。「ピーク」とは、
 * その要素が隣接する要素よりも大きい場合を指します。配列の最初または最後の要素が隣接する単一の要素より大きい場合、
 * それらもピークとみなされます。配列内に複数のピークがある場合は、どれでも一つを出力して構いません。配列はハードコーディングされているものとします。
 * 
 * 
 */

public class Java29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 1, 3, 20, 4, 1, 0 };
		for (int i = 0; i < array.length; i++) {
			if ((i == 0 || array[i] > array[i - 1]) && (i == array.length - 1 || array[i] > array[i + 1])) {
				System.out.println(array[i]);

			}
		}

	}

}
