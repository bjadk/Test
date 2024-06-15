package com.sun;

/**
 * 文字列変換」クラスを作成し、与えられた文字列の全ての文字を大文字または小文字に変換する機能を含めてください。このクラスには、
 * 文字列を大文字に変換するメソッドと小文字に変換するメソッドを含めてください。入力された文字列を受け取り、
 * 大文字に変換した結果と小文字に変換した結果を出力します。
 * 
 */
public class Inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "LemiCode";
		String upperCase = input.toUpperCase();
		System.out.println(upperCase);

		String lowerCase = input.toLowerCase();
		System.out.println( lowerCase);

	}
}
