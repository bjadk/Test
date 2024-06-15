package com.sun;

/**
 * 2つの整数の最大公約数を計算するメソッドgcdを作成してください。このメソッドは再帰を使用せず、 ループを通じて最大公約数を計算してください。
 * 
 * 
 */

public class Java34 {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		int a = 31;
		boolean falg = true;
		isPrime(a);
		return a;
		
	}
	public static boolean isPrime(int a) {
		for ( int i =2;i <=Math.sqrt(a);i++) {
		if( a%i ==0) {
			return false;
		}
			
		}
return true;
	
	}
}
