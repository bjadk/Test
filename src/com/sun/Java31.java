package com.sun;

import java.util.Scanner;
/**Javaの main メソッド内で、整数の配列が与えられた場合に、その配列のバランスポイントを見つけ出してください。バランスポイントとは、
 * 配列の特定の位置で、その位置より前のすべての要素の合計と
 * 、その位置より後ろのすべての要素の合計が等しくなる点を指します。配列はハードコーディングされているものとします。
 * バランスポイントが存在する場合はそのインデックスを、存在しない場合は -1 を出力してください。
 * 
 * 
 */
public class Java31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int []array = new int[] {1, 2, 3, 4, 3, 2, 1};
		 int totalSum = 0;
	        int leftSum = 0;
	        for( int i = 0; i< array.length;i++) {
	        	if (leftSum == totalSum - leftSum - array[i]) {
	                System.out.println("バランスポイントのインデックス: " + i);
	                return;
	            }
	            leftSum += array[i];
	            System.out.println(leftSum);
	        }
		}

	}
