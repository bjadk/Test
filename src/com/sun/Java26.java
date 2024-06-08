package com.sun;

/**整数の二次元配列が与えられた場合に、その配列の対角線上にある要素の合計を計算し、出力してください。
 * ここで対角線とは、配列の左上から右下にかけての要素を指します。二次元配列はハードコーディングされているものとします。
 * 
 * 
 */


public class Java26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]array = new int[][]{
			{1, 2, 3}, 
			{4, 5, 6},
			{7, 8, 9}
			};
			int sum = 0;
			for( int i = 0; i< array.length; i++)
				sum +=array[i][i];
			System.out.println( sum);
		
			

	}

}
