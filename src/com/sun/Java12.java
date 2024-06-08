package com.sun;

import java.util.Scanner;

/**
 * ユーザーが入力した月に基づいて、それに対応する季節を判定するJavaプログラムを書いてください。
 * 季節の分類は以下の通りです：3～5月は「春」、6～8月は「夏」、9～11月は「秋」、12月、1月、2月は「冬」とします。
 */
public class Java12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		if (month >= 3 && month <= 5) {
			System.out.println("spring");
		} else if (month >= 6 && month <= 8) {
			System.out.println("summer");
		} else if (month >= 9 && month <= 11) {
			System.out.println("autumn");
		} else {
			System.out.println("winter");

		}

	}

}
