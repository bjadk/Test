package com.sun;

/**
 * 「自動車」クラスを作成し、staticおよびfinalキーワードを使用してください。
 * このクラスには、車両のモデル名、レンタル料金、そしてfinalで定義された基本料金（例えば、一日あたりの料金）を含めてください。
 * また、全てのレンタル車両の総数を追跡するstatic変数と、特定の自動車のレンタル料金を計算するstaticメソッドも追加してください。
 * レンタル料金は、基本料金にレンタル日数を乗算して計算します。
 * 
 * 
 */
public class Cars {
	static int totalCars = 0;
	final static int BASE_RATE = 3000;
	String model;
	int rentalDays;

	Cars(String model, int rentalDays) {
		this.model = model;
		this.rentalDays = rentalDays;
		totalCars++;

	}

	static int calculateRentalFee(int rentalDays) {
		return BASE_RATE * rentalDays;
	}

	void displayRentalInfo() {
		System.out.println("モデル: " + model);
		System.out.println("レンタル日数: " + rentalDays + "日");
		System.out.println("合計レンタル料金: " + calculateRentalFee(rentalDays) + "円");
		System.out.println("全車両数: " + totalCars);
	}
}	