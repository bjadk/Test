package com.sun;

import java.util.Scanner;

/**
 * ユーザーが入力した年齢に基づいて人を分類するプログラムを書いてください。
 * 分類は以下の通りです：0～12歳は「子供」、13～19歳は「青少年」、20～59歳は「成人」、60歳以上は「高齢者」とします。
 */

public class Java9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if (age <= 12) {
			System.out.println("子供");
		} else if (age <= 19) {
			System.out.print("青少年");
		} else if (age <= 59) {
			System.out.println("成人");
		} else if (age >= 60) {
			System.out.println("高龄者");

		}

	}

}
