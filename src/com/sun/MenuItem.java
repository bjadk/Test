package com.sun;

import java.util.ArrayList;
import java.util.List;

/**
 * 「テーブル注文管理」クラスを作成し、レストランの複数のテーブルでの注文をリストで管理する機能を含めてください。このクラスには、
 * 各テーブルの注文リストを保持するListのList（二重リスト）を使用してください。各テーブルに注文を追加し、
 * レストラン内の全テーブルの注文を表示するメソッドを含めてください。各注文には、料理名と価格が含まれます。
 * 
 */
public class MenuItem {
	String name;
	int price;

	MenuItem(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ":" + price + "円";

	}

}
class OrderManager {
    private List<List<MenuItem>> tableOrders = new ArrayList<>();

    /**
     * 新しいテーブルの注文リストを追加するメソッド。
     *
     * @param orders 各テーブルの注文リスト
     */
    public void addTableOrder(List<MenuItem> orders) {
        tableOrders.add(orders);
    }

    /**
     * 全てのテーブルの注文を表示するメソッド。
     */
    public void printOrders() {
        int tableNumber = 1;
        for (List<MenuItem> orders : tableOrders) {
            System.out.println("テーブル" + tableNumber + "の注文:");
            for (MenuItem order : orders) {
                System.out.println(order);
            }
            tableNumber++;
		}
	}
}