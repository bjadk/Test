package com.sun;

/**
 * 「文字カウント」クラスを作成し、与えられた文字列内の特定文字が何回出現するかを数える機能を含めてください。
 * このクラスには、特定文字の出現回数をカウントするメソッドを含めてください。入力された文字列と特定文字を受け取り、
 * その文字が文字列内に何回出現するかを出力します。
 * 
 * 
 * 
 */
public class Tex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] text = { "こんにちは、皆さんこんにちは！" };
		String targetWord = "ん";
		int count = 0;
		for (String str : text) {
			int index = 0;

			while ((index = str.indexOf(targetWord, index)) != -1) {
				count++;
				index += targetWord.length();
			}

		}

		System.out.println(count);
	}
}
