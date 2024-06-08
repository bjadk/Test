package com.sun;

import java.lang.reflect.Array;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		int[][] transposed = new int[array.length][array.length];
//
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				transposed[j][i] = array[i][j];
//
//			}
//
//		}
//		for (int i = 0; i < transposed.length; i++) {
//			for (int j = 0; j < transposed[i].length; j++) {
////				System.out.print(transposed[i][j] + " ");
//		int[] array = { 1, 2, 3, 2, 4, 5, 1, 6 };
//Javaの main メソッド内で、0と1が混在する整数配列が与えられた場合に、各要素について最も近い0までの距離を計算して新しい配列として出力してください。距離はインデックスの差で測ります。配列はハードコーディングされているものとします。


//		for (int i = 0; i < array.length; i++) { distance    
		
		
//			for (int j = i + 1; j < array.length; j++) {
//				if (array[i] == array[j]) {
//					System.out.println(array[i]);

		int[] array = { 1, 0, 2, 1, 0, 1, 2, 3, 4 };
			int[] distances = new int[array.length];
	        int lastZero = Integer.MAX_VALUE / 2; 
	        for (int i = 0; i < array.length; i++) {
	        	if(array[i] == 0) {
	        		lastZero = i;
	        	}
	        	distances[i] = i - lastZero;
	        }
	        
	        lastZero = Integer.MAX_VALUE / 2;
	        for (int i = array.length - 1; i >= 0; i--) {
	            if (array[i] == 0) {
	                lastZero = i;
	            }
	            distances[i] = Math.min(distances[i], lastZero - i);
	        }

	        // 出力
	        System.out.print("各要素から最も近い0までの距離: ");
	        for (int dist : distances) {
	            System.out.print(dist + " ");
		}
	}
}
