package com.sun;

/**
 * 第三の変数を使用せずに、2つのint型変数の値を交換するJavaプログラムを書いてください。
 * 
 * 
 * 
 */

public class Java6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.print(a + " " + b);

	}

}
