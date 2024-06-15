package com.sun;

/**
 * 「メールアドレス処理」クラスを作成し、与えられたメールアドレスからドメイン名を抽出する機能を含めてください。
 * メールアドレスは「ユーザー名@ドメイン名」の形式で与えられます。ドメイン名を抽出し、 それを出力するメソッドを含めてください。
 * 
 * 
 */
public class Emial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "tanaka@example.com";
		int atIndex = email.indexOf('@');
		String domain = email.substring(atIndex + 1);
		System.out.println("ドメイン名: " + domain);

	}

}
