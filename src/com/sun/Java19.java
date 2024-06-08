package com.sun;

import java.util.Scanner;

/**
 * キーボードから入力された一連の整数の中で、負の数が入力されたら入力を停止し、それまでに入力された偶数の合計を計算して出力するプログラムを書いてください。
 * 
 * 
 */

public class Java19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		while (true) {
			int a = scanner.nextInt();
			if (a < 0)
				;
			break;

		}
     int a = 0;
     if ( a%2 == 0) {
    	 sum += a;
    	 System.out.println(sum);
     }
		
		
	}

}
