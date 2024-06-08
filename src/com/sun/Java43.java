package com.sun;

/**
 * 与えられた文字列の中で特定の文字が何回出現するかを数えるメソッドcountCharacterを作成してください。
 * 
 * 
 */

public class Java43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countCharacter("java programming", 'a'));

	}

	public static int countCharacter(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;

			}

		}
		return count;
	}

}
