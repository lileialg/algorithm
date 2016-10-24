package com;

import java.util.HashSet;
import java.util.Set;

public class WordBreak1 {

	public static boolean isOk(String str, Set<String> dic) {
		
		if (str == null)
			return false;
		
		if (dic.contains(str))
			return true;

		for (int i = 1; i <= str.length(); i++) {

			String sub = str.substring(0, i);
			
			if (dic.contains(sub)) {
				String sub2 = str.substring(i);
				if (isOk(sub2, dic)) {
					return true;
				}
			}

		}

		return false;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "leetcode";
		
		Set<String> dic = new HashSet<String>();
		
		dic.add("leev");
		
		dic.add("code");
		
		System.out.println(isOk(s,dic));
	}

}
