package com.sun;

/**
 * Queueインターフェースを利用して、銀行の窓口での顧客の待ち行列をシミュレートするプログラムを作成してください。以下の要件に従ってください。
 * Customerクラスを作成します。このクラスには、顧客の名前を表すnameというString型のフィールドがあります。
 * Queue<Customer>のインスタンスを作成し、複数のCustomerオブジェクトを追加します。
 * キューから顧客を一人ずつ取り出し、"〇〇（顧客の名前）さん、窓口にどうぞ。"と表示します。 キューが空になるまで、3の操作を繰り返します。
 * 
 * 
 */
public class Customer {
	String name;

	Customer(String name) {
		this.name = name;
	}

}

