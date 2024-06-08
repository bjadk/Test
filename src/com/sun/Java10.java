package com.sun;

import java.util.Scanner;

/**
 * 成績等級にはA、B、C、Dの4つがあり、それぞれ「優」、「良」、「合格」、「不合格」を意味します。
 * ユーザーが成績等級に対応するを入力した場合、それに応じた評価を出力するプログラムを書いてください。入力が誤っている場合は「**_**」を出力してください。
 * 
 */

public class Java10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String score = scanner.nextLine();
		switch (score) {
		case "A":
			System.out.println("优");
			break;
		case "B":
			System.out.println("良");
			break;
		case "C":
			System.out.println("合格");
			break;
		case "D":
			System.out.println("不合格");
			break;
		default:
			System.out.println("**_**");

		}

	}

}
