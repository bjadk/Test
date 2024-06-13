package com.sun;

/**
 * 「計算」の基底インターフェースを作成し、その中にcalculateメソッドを定義します。
 * このインターフェースを実装する派生クラス「加算」、「減算」、「乗算」、「除算」を作成し、
 * それぞれのクラスで異なる計算方法を実装してください。メインクラスでは、これらの計算クラスのインスタンスを使用して具体的な計算を行います。
 * 
 */
interface Calculate {
	int Calculate(int a, int b);
}

class Addition implements Calculate {

	@Override
	public int Calculate(int a, int b) {

		return a + b;
	}

}

class Subtraction implements Calculate {

	@Override
	public int Calculate(int a, int b) {

		return a - b;
	}

}

class Multiplication implements Calculate {

	@Override
	public int Calculate(int a, int b) {

		return a * b;
	}

}

class Division implements Calculate {

	@Override
	public int Calculate(int a, int b) {

		return a / b;
	}

}