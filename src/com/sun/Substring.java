package com.sun;

/**
 * 「サブストリングチェック」クラスを作成し、与えられた二つの文字列が含まれているかどうかを確認する機能を含めてください。
 * このクラスには、一つの文字列がもう一つの文字列のサブストリング（部分文字列）であるかをチェックするメソッドを含めてください。メソッドは、
 * 文字列Aが文字列Bのサブストリングである場合は「含まれています」と出力し、そうでない場合は「含まれていません」と出力します。
 * 
 */
public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strA = "こんにちは";
		String strB = "今日はいい天気で、こんにちは";
		if (strB.contains(strA)) {
			System.out.println("含まれている");
		} else {
			System.out.println("含まれていない");
		}

	}

}
