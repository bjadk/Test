package com.sun;

import java.util.Scanner;

/**
 * √√与えられた整数が素数（1とその数自身以外に正の約数を持たない数）かどうかを判定するメソッドisPrimeを作成してください。
 * 
 * 
 */

public class Java37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime( 54));

	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % 1 == 0) {
				return false;
			}

		}
		return true;
	}
}
