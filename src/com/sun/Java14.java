package com.sun;

import java.util.Scanner;

/*数列9、99、999...9999999999の和を計算するJavaプログラムを書いてください。
 * この数列は各項が前の項に10を掛けて9を加えることで生成されます。ループを使用してこの数列を生成し、同時に和を求めてください。
 * 
 */

public class Java14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		long sum = 0;
		long number = 9;
		for (int i = 1; i <= 10; i++) {
			sum += number;
			number = number * 10 + 9;
			System.out.println("sum");

		}
	}

}
