
package com.sun;

/**整数の二次元配列が与えられた場合に、その配列の行と列を交換して
 * 、新しい配列を作成し出力してください。この操作を「転置」と呼びます。二次元配列は正方形（同じ数の行と列）と仮定してかまいません。
 * 二次元配列はハードコーディングされているものとします。


 * 
 */
public class Java27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]array =new int[][] {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
			};
			int [][]transposed = new int[ array.length][array.length];
			for( int i = 0; i< array.length;i++) {
				for( int j =0; j<array.length;i++) {
					System.out.println(array[i][j]);
			}
			

	} 

}
}