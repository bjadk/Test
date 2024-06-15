package com.sun;

/**
 * 「招待状生成」クラスを作成し、参加者の名前とイベントの日付を含む招待状のテキストを生成する機能を含めてください
 * 。参加者の名前とイベントの日付は引数としてメソッドに渡され、フォーマットされた招待状の文字列を出力します。
 * 招待状のフォーマットは「[名前]様、[日付]のイベントにご招待します。」とします。
 * 
 */
public class Invitaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] items = { " yamada ", " 2023年4月1日 " };
		System.out.print( items[0]+"様、");
		System.out.println(items[1]	+ "のイベントにご招待します ");

	}
}
