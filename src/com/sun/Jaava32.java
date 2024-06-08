package com.sun;

/**
 * Javaの main メソッド内で、整数の配列が与えられた場合に、
 * その配列内で最も長い連続する数のシーケンス（連続する数字の列）の長さを見つけ出してください。
 * シーケンスの要素は順不同であってもかまいません。配列はハードコーディングされているものとします。
 * 
 * 
 */

public class Jaava32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area1 = getArea(39, 80);
		int area2 = getArea(50, 10);
		if (area1 > area2) {
			System.out.println("result1 big");
		} else {
			System.out.println("result2 big");
		}

	}

	public static int getArea(int length, int width) {
		int area = length * width;
		return area;

	}

	public static void getSum(int length, int width, int length1, int width1) {
		int result1 = length * width;
		int result2 = length1 * width1;

		if (result1 > result2) {
			System.out.println("result1 big");
		} else {
			System.out.println("result2 big");

		}
	}
}
