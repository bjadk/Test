package com.sun;
import java.util.Scanner;
public class Java21 {

	/**キーボードから入力された整数の桁数を計算して出力するプログラムを書いてください。入力された整数が0以下の場合は、その数自体を出力します。
	 * 
	 * 
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		while (true) {
			int number = scanner.nextInt();
			if (number <= 0) {
				System.out.println(number);
			}else {
				int digits = 0;
	            for (; number > 0; number /= 10) {
	                digits++;
	            }
	            System.out.println(digits);
			}
		}
		

	}

}
