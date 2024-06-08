package com.sun;
import java.util.Scanner;
/**
 * コンソールから整数を入力してもらい、ユーザーが非正数（0または負の数）を入力した時点で入力を停止します。
 * このプログラムはユーザーが入力した正の整数の個数をカウントし、その数を出力してください。入力される数の数は2147483647を超えないと仮定します。
 * 
 * 
 * 
 */

public class Java15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = 408;
		while (a < 0) {
			a++;
			System.out.println(a);
			if (a <= 0)
				;
			{
				break;
			}
		

		}

	}

}
