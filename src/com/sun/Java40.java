package com.sun;

/**
 * 与えられた基数と指数から累乗を計算するメソッドpowerを作成してください。
 * 
 */

public class Java40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(5, 2));

	}

	public static int power(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;

		}
		return result;
	}
}
