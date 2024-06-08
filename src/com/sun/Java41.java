package com.sun;

/**
 * 与えられた年が閏年（リープイヤー）かどうかを判定するメソッドisLeapYearを作成してください。
 * 
 * 
 */

public class Java41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLeapYear(2023));

	}

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else {
			return false;

		}
	}

}
