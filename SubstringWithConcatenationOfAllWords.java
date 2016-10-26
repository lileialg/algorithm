package com.c15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstringWithConcatenationOfAllWords {

	public static int[] substringWithConcatenationOfAllWords(String str,
			String[] array) {

		List<Integer> list = new ArrayList<Integer>();

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String s : array) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}

		int len = array[0].length();

		loop: for (int i = 0; i < str.length() - (len * array.length) + 1; i++) {

			int pos = i;
			
			map.clear();
			
			for (String s1 : array) {
				if (map.containsKey(s1)) {
					map.put(s1, map.get(s1) + 1);
				} else {
					map.put(s1, 1);
				}
			}

			while (pos - i < array.length * len) {

				String s = str.substring(pos, pos + len);

				if (map.containsKey(s)) {

					if (map.get(s) > 1) {
						map.put(s, map.get(s) - 1);
					} else {
						map.remove(s);
					}

					pos = pos + len;
				} else {
					continue loop;
				}
				
				if (map.isEmpty()){
					list.add(i);
					
					
				}

			}

		}

		int[] result = new int[list.size()];

		for (int i = 0; i < result.length; i++)
			result[i] = list.get(i);

		return result;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		String str = "vbarfoothefoobarman";
		
		String[] array = new String[]{"foo", "bar"};
		
		int[] result = substringWithConcatenationOfAllWords(str, array);
		
		for(int v:result)
			System.out.print(v+",");
		
	}

}
