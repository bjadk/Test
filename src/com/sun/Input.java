package com.sun;
/**「文字列逆順」クラスを作成し、与えられた文字列を逆順にして出力する機能を含めてください。
 * このクラスには、文字列を逆順にするメソッドを含めてください。入力された文字列を逆順に並べ替えて、その結果を出力します。
 * 
 */
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="こんにちは LemiCode";
		String reversed = new StringBuilder( input).reverse().toString();
		System.out.println(reversed);
	}

}
