package com;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum2 {

	public static void combinationSum(int p, int target, int[] array,
			List<Integer> subList, List<List<Integer>> list) {

		if (target == 0) {
			list.add(subList);
		} else {
			for (int pos = p; pos <= array.length; pos++) {
				int value = array[pos - 1];
				if (target >= value) {

					List<Integer> newList = new ArrayList<Integer>();

					for (int v : subList)
						newList.add(v);

					newList.add(value);

					combinationSum(pos + 1, target - value, array, newList,
							list);

				}
			}
		}

	}

	public static void main(String[] args) {

		List<List<Integer>> list = new ArrayList<List<Integer>>();

		int[] array = new int[] {10,1,2,7,6,1,5 };

		combinationSum(1, 8, array, new ArrayList<Integer>(), list);

		for (List<Integer> subList : list) {
			for (int v : subList)
				System.out.print(v + ",");

			System.out.println();
		}
	}

}
