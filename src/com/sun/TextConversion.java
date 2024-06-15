package com.sun;

/**
 * 「文字列トリミング」クラスを作成し、与えられた文字列の先頭と末尾の空白を削除する機能を含めてください。
 * このクラスには、文字列の空白を削除するメソッドを含めてください。入力された文字列を受け取り、トリミングした結果を出力します。
 * 
 */
public class TextConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "   こんにちは、LemiCodeさん！ ";
		String trim = input.trim();
		System.out.println(trim);

	}

}
