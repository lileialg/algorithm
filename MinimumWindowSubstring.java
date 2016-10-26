package com.c15;

public class MinimumWindowSubstring {

	public static String minimumWindowString(String S, String T) {

		char[] cs = S.toCharArray();

		char[] ts = T.toCharArray();

		int num = 0;

		int[] sv = new int[256];

		int[] tv = new int[256];

		for (char c : ts) {
			tv[(int) c] = 1;
		}

		int start = 0;

		while (start < cs.length) {
			if (tv[(int) cs[start]] > 0) {

				if (sv[(int) cs[start]] == 0) {
					num++;
				}

				sv[(int) cs[start]]++;

			}

			if (num == ts.length) {
				break;
			}

			start++;
		}

		if (num == ts.length) {
			int tmp1 = 0;
			for (int i = 0; i <= start; i++) {

				if (tv[(int) cs[i]] > 0) {
					if (sv[(int) cs[i]] > 1) {
						sv[(int) cs[i]]--;
					} else {
						tmp1 = i;
						break;
					}
				}

			}
			int end = start;
			start = tmp1;

			int minEnd = end;
			int minStart = start;

			while (end < cs.length) {
				int startCode = (int) cs[start];

				int end1 = end + 1;

				boolean flag = false;

				while (end1 < cs.length) {
					if (startCode == (int) cs[end1]) {
						flag = true;
						break;
					}

					if (tv[(int) cs[end1]] > 0) {
						sv[(int) cs[end1]]++;
					}

					end1++;
				}

				if (flag) {
					for (int i = start + 1; i <= end1; i++) {

						if (tv[(int) cs[i]] > 0) {
							if (sv[(int) cs[i]] > 1) {
								sv[(int) cs[i]]--;
							} else {
								tmp1 = i;
								break;
							}
						}

					}

					start = tmp1;
					end = end1;

					if (end - start < minEnd - minStart) {
						minStart = start;
						minEnd = end;
					}

				} else {
					break;
				}

			}

			return S.substring(minStart, minEnd + 1);

		}
		return null;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minimumWindowString("vvvaattcbvvvabbc", "abc"));
	}

}
