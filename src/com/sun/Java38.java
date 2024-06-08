package com.sun;

/**
 * 二つの文字列がアナグラム（文字の並びを変えることで、別の単語やフレーズを作ること）かどうかを判定するメソッドisAnagramを作成してください。
 * 
 */

public class Java38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "earth";
		String str12 = " heart";
		boolean result = isAnagram("earth", "heart");
		System.out.println(result);

	}

	public static boolean isAnagram(String str1, String str2) {
		 str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();
	
		if (str1.length() != str2.length()) {
		}
		return false;
		
		}
	}
