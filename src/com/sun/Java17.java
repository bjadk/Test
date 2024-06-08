package com.sun;

import java.util.Scanner;

/**
 * キーボードから任意の数の10000以下の正整数を入力し、負の数が入力されたときに入力を終了し、
 * 
 * それまでに入力された正整数の平均値を計算して出力するプログラムを書いてください。平均値はdouble型で計算し、小数点以下2桁で出力します。
 * 
 */

public class Java17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int count = 0;
		System.out.println();

		while (true) {
			int number = scanner.nextInt();
			if (number < 0)
				break;
		}

		int number = 0;
		if (number <= 1000) {
			sum += number;
			count++;

		} else {
			System.out.println();
		}

	}
}
