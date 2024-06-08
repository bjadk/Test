package com.sun;

/**
 * キーボードから6つの整数を入力し、それらを配列に格納した後、まず配列を正順で出力し、次に配列を逆順にして出力するプログラムを書いてください。
 * 
 */

public class Java24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 234;
		if (number % 10 == 0) {
			System.out.println("The unit place (ge) is 0");
		}

		if (number % 100 / 10 == 0) {
			System.out.println("The tens place (shi) is 0");
		}

		if (number % 100 / 100 == 0) {
			System.out.println("The hundreds place (bai) is 0");
		}
	}
}