package com.sun;

/**
 * 銀行口座」クラスを作成し、staticおよびfinalキーワードを使用してください。このクラスには、口座番号、口座残高、
 * そしてfinalで定義された銀行コードを含めてください。
 * また、全ての口座の数を追跡するstatic変数と、口座の詳細を表示するstaticメソッドも追加してください。
 * 口座を作成するたびに、口座数を増やすようにします。
 * 
 * 
 */
public class BankAccounts {
	static int numberOfAccounts = 0;
	final static int BANK_CODE = 101;
	String accountNumber;
	int balance;

	BankAccounts(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		numberOfAccounts++;
	}

	static void displayAccountDetails(BankAccounts account) {
		System.out.println("銀行コート：" + BANK_CODE);
		System.out.println("口座番号: " + account.accountNumber + ", 残高: " + account.balance + "円");
		System.out.println("全口座数: " + numberOfAccounts);
	}

}
