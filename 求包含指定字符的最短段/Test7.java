package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test7 {

	/**
	 * @param args
	 * 广度搜索
	 */
	public static void main(String[] args) {
		// 寻找ABCD

		String finder = "ABCD";

		String str = "A132A33333333BCD33ABCD";

		int mstart = str.length();
		int mend = 0;

		int start = 0;
		int end = 0;

		String startStr = null;

		// init
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (finder.indexOf(str.substring(i, i + 1)) >= 0) {
				map.put(str.substring(i, i + 1), i);
			}

			if (map.size() == finder.length()) {
				mend = i;
				end = i;
				break;
			}
		}

		if (map.size() == finder.length()) {

			Set<Entry<String, Integer>> set = map.entrySet();

			Iterator<Entry<String, Integer>> it = set.iterator();

			while (it.hasNext()) {
				Entry<String, Integer> en = it.next();

				if (en.getValue() < mstart) {
					mstart = en.getValue();
					startStr = en.getKey();
				}
			}

			start = mstart;

			for (int i = end + 1; i < str.length(); i++) {
				String s = str.substring(i, i + 1);

				if (finder.indexOf(s) >= 0) {
					if (startStr.equals(s)) {
						for (int j = start + 1; j < i; j++) {
							String s1 = str.substring(j, j + 1);

							if (finder.indexOf(s1) >= 0) {
								if (str.substring(j + 1, i + 1).indexOf(s1) < 0) {
									start = j;

									startStr = str.substring(start, start + 1);

									break;
								}
							}
						}

						end = i;

						if (end - start < mend - mstart) {
							mend = end;
							mstart = start;
						}
					} else {

						// 求出最右边位置
						int rightPos = -1;
						for (int k = mend; k > mstart; k--) {
							if (s.equals(str.substring(k, k + 1))) {
								rightPos = k;
								break;
							}
						}

						String rightSub = str.substring(rightPos + 1, i + 1);

						for (int k = mstart; k < rightPos; k++) {
							String s0 = str.substring(k, k + 1);

							if (finder.indexOf(s0) >= 0) {
								if (rightSub.indexOf(s0) < 0) {
									start = k;
									startStr = s0;
									break;
								}
							}
						}

						mend = i;

						if (end - start < mend - mstart) {
							mend = end;
							mstart = start;
						}

					}
				}

			}

			System.out.println(mstart + "," + mend);

		} else {
			System.out.println("没有满足的数据");
		}

	}

}
