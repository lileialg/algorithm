package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak2 {

	public static void isOk(String str, Set<String> dic, List<String> subList,
			List<List<String>> list) {

		if (str == null)
			return;

		if (dic.contains(str)) {
			subList.add(str);

			list.add(subList);
		}

		for (int i = 1; i <= str.length(); i++) {

			String sub = str.substring(0, i);

			if (dic.contains(sub)) {

				List<String> newSubList = new ArrayList<String>();

				for (String s : subList)
					newSubList.add(s);

				newSubList.add(sub);

				String sub2 = str.substring(i);
				isOk(sub2, dic, newSubList, list);
			}

		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "catsanddog";

		Set<String> dic = new HashSet<String>();

		dic.add("cat");
		dic.add("cats");
		dic.add("and");
		dic.add("sand");
		dic.add("dog");

		List<String> subList = new ArrayList<String>();

		List<List<String>> list = new ArrayList<List<String>>();

		isOk(s, dic, subList, list);

		for (List<String> ls : list) {
			for (String v : ls)
				System.out.print(v + ",");

			System.out.println();
		}
	}

}
