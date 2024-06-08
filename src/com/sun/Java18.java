package com.sun;

import java.util.Scanner;

/**与えられた整数が素数であるかどうかを判断するプログラムを書いてください。素数は1より大きく、1とその数自身以外には約数を持たない正の整
 * 
 * 
 */


public class Java18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean isPrime = true;
		int number = scanner.nextInt();
				System.out.println();
	    if(number <=1 ) {
	    isPrime = false;
	    }else {
	    	for (int i = 2; i <= Math.sqrt(number); i++) {
	    }
           int i = scanner.nextInt();
	    	if (number % i == 0) {
                isPrime = false;
               System.out.println(isPrime);
            }
	    }

	}

}
