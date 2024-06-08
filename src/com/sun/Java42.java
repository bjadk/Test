package com.sun;

/**
 * 与えられた文字列がパリンドローム（前後から読んでも同じになる文字列） であるかどうかを判定するメソッドisPalindromeを作成してください。
 * 
 * 
 */

public class Java42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("madam"));

	}

	public static boolean isPalindrome(String n) {
		int left = 0;
		int right = n.length() - 1;
		while (left < right) {
			if (n.charAt(left) != n.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
