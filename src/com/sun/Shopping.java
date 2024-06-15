package com.sun;

/**
 * 「ショッピングリスト」クラスを作成し、複数の商品名を一つの文字列に結合し、
 * 特定の商品をリストから置換する機能を含めてください。このクラスには、商品名をコンマで結合するメソッドと、
 * リスト内の特定の商品を別の商品で置換するメソッドを含めてください。
 * 
 */

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] items = { "りんご", "バナナ", "トマト" };
		String combinedList = String.join(",", items);

		System.out.println("結合されたリスト: " + combinedList);
		String replaceList = combinedList.replace("バナナ", "いちご");
		System.out.println("置換後のリスト: " + replaceList);

	}

}
