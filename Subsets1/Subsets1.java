package com;

import java.util.ArrayList;
import java.util.List;

public class Subsets1 {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3,4 };

		mergeSort(new int[array.length], array, 0, array.length - 1);

		List<List<Integer>> subset = new ArrayList<List<Integer>>();

		for (int i = 0; i <= array.length; i++) {
			subsets1(array, 1, i, new ArrayList<Integer>(), subset);
		}

		for(List<Integer> list : subset){
			for(int v : list)
				System.out.print(v+",");
			
			System.out.println();
		}

	}

	public static void subsets1(int[] array, int start, int num,
			List<Integer> list, List<List<Integer>> subset) {

		if (num == 0)
			subset.add(list);
		else {
			for (int i = start; i <= array.length - num + 1; i++) {
				List<Integer> list2 = new ArrayList<Integer>(list);
				list2.add(array[i - 1]);

				subsets1(array, i + 1, num - 1, list2, subset);
			}
		}

	}

	public static void mergeSort(int[] aux, int[] array, int start, int end) {

		if (start < end) {

			int mid = (start + end) / 2;

			mergeSort(aux, array, start, mid);
			mergeSort(aux, array, mid + 1, end);

			int p = start;
			int p1 = start;
			int p2 = mid + 1;

			while (p1 <= mid && p2 <= end) {
				if (array[p1] <= array[p2]) {
					aux[p++] = array[p1];
					p1++;
				} else {
					aux[p++] = array[p2];
					p2++;
				}
			}

			while (p1 <= mid) {
				aux[p++] = array[p1];
				p1++;
			}

			while (p2 <= end) {
				aux[p++] = array[p2];
				p2++;
			}

			for (int i = start; i <= end; i++) {
				array[i] = aux[i];
			}

		}

	}

}
