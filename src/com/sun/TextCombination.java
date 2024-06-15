package com.sun;

/**
 * 「文字列結合」クラスを作成し、与えられた複数の文字列を一つの文字列に結合する機能を含めてください。このクラスには、複数の文字列を受け取り、
 * それらを一つの文字列に結合するメソッドを含めてください。メソッドは、与えられた文字列を順番に結合して、結合後の結果を出力します。
 * 
 * 
 */
public class TextCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "Java", "は", "楽しい" };
		StringBuilder combined = new StringBuilder();
		for (String input1 : input) {
			combined.append(input1);

		}
		System.out.println("結合された文字列: " + combined.toString());

	}

}
