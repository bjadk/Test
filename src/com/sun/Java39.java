package com.sun;

/**
 * 整数をローマ数字に変換するメソッドconvertToRomanを作成してください
 * 
 */

public class Java39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToRoman(58));

	}

	public static String convertToRoman(int n) {
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < values.length; i++) {
			while (n >= values[i]) {
				n -= values[i];
				sb.append(symbols[i]);

			}
		}
		return sb.toString();

	}
}
