package com.volienceenum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfAPhoneNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Character, String> map = new HashMap<Character, String>();

		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		
		char[] cs = "23".toCharArray();
		
		
		List<String> list1 = new ArrayList<String>();
		
		String str1 = map.get(cs[0]);
		
		for(char c: str1.toCharArray()){
			list1.add(String.valueOf(c));
		}
		
		for(int i=1;i<cs.length;i++){
			
			List<String> list2 = new ArrayList<String>();
			
			
			char c = cs[i];
			
			String str2 = map.get(c);
			
			char[] cs2 = str2.toCharArray();
			
			for(char c2 :cs2){
				for(String c1:list1){
					list2.add(c1+c2);
				}
			}
			
			list1 = list2;
			
		}
		
		for(String s : list1)
			System.out.print(s+",");
		

	}

}
