package com.sun;

import java.util.Scanner;

/*体重指数は体重（kg）を身長（m）の平方で割ったものです。この指数に基づき、
 * 体型を判定するJavaプログラムを書いてください。体重指数が18.5未満の場合は「やせ型」、18.5以上20.9未満の場合は「スリム」、
 * 20.9以上24.9以下の場合は「標準」、24.9を超える場合は「肥満気味」と判定してください。
 * 
 */

public class Java13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double height = scanner.nextDouble();
		double weight =scanner.nextDouble(); 
		double bmi = weight / (height * height);
		if (bmi < 18.5) {
			System.out.println("やせ型");
		} else if (bmi > 18.5 && bmi < 20.9) {
			System.out.println("スリム");
		} else if (bmi > 20.9 && bmi < 24.9) {
			System.out.println("標準");

		}
	}

}
