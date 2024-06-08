package com.sun;

import java.util.Scanner;

public class Java20 {

	/**
	 * 
	 * キーボードから入力された一連の整数の中で、0が入力されたら入力を停止し、それまでに入力された数の中で最大値と最小値を求めて出力するプログラムを書いてください。
	 * 
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int max = scanner.nextInt();
		int min = scanner.nextInt();
		while (true) {
			int number = scanner.nextInt();
			if (number == 0) {
				break;

			}
			
			if( number >max) {
				max = number;
			} if
			( number < min );
			min = number;
			System.out.println();
	}
		}

	

}
