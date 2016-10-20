package com;

import java.util.ArrayList;
import java.util.List;

public class ParlindromPartitioning {

	public static List<List<String>> parlindromPartitioning(String str) {

		List<List<String>> list = new ArrayList<List<String>>();

		for (int i = 0; i < str.length(); i++) {

			String first = str.substring(0, i + 1);

			if (isParlindrom(first)) {

				List<List<String>> list2 = parlindromPartitioning(str
						.substring(i + 1, str.length()));

				if (list2.size() > 0) {

					for (List<String> tmp : list2) {
						List<String> subList = new ArrayList<String>();
						subList.add(first);
						for (String s : tmp) {
							subList.add(s);
						}

						list.add(subList);
					}
				} else {
					List<String> subList = new ArrayList<String>();
					
					subList.add(first);

					list.add(subList);
				}
			}
		}

		return list;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<String>> list2 = parlindromPartitioning("aadfsafasdf");

		for (List<String> tmp : list2) {
			for (String s : tmp) {
				System.out.print(s + ",");
			}
			System.out.println();

		}
	}

	public static boolean isParlindrom(String str) {
		if (str == null || "".equals(str))
			return true;

		int len = str.length();

		int mid = len / 2;

		for (int i = 0; i <= mid; i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(len - i - 1);
			if (c1 != c2)
				return false;
		}

		return true;
	}

}
