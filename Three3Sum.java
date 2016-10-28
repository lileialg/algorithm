package com.c2;

import java.util.ArrayList;
import java.util.List;

public class Three3Sum {

	public static List<int[]> threeSum(int[] array, int target) {
		List<int[]> list = new ArrayList<int[]>();

		int[] aux = new int[array.length];

		mergeSort(aux, array, 0, array.length - 1);

		int left = 0;

		int right = array.length - 1;

		while (left +1 < right) {

			int mid = left + 1;

			while (mid < right) {

				if (array[left] + array[mid] + array[right] == target) {
					list.add(new int[] { array[left], array[mid], array[right] });

					right--;
					
					break;
				} else {
					if (array[left] + array[mid] + array[right] > target) {
						right--;
						break;
					} else {
						if (mid < right) {
							mid++;
							if (mid >= right) {
								left++;
								break;
							}
						} else {
							left++;
							break;
						}
					}
				}

			}
		}

		return list;
	}

	public static void mergeSort(int[] aux, int[] array, int left, int right) {

		int mid = (left + right) / 2;

		if (mid > left)
			mergeSort(aux, array, left, mid);

		if (right > mid + 1)
			mergeSort(aux, array, mid + 1, right);

		int pos = left;

		int p1 = left;

		int p2 = mid + 1;

		while (pos <= right && p1 <= mid && p2 <= right) {
			if (array[p1] <= array[p2]) {
				aux[pos++] = array[p1];
				p1++;
			} else {
				aux[pos++] = array[p2];
				p2++;
			}
		}

		while (p1 <= mid) {
			aux[pos++] = array[p1];
			p1++;
		}

		while (p2 <= right) {
			aux[pos++] = array[p2];
			p2++;
		}

		for (int i = left; i <= right; i++) {
			array[i] = aux[i];
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[] { -1, 0, 1, 2, -1, -4 };

		List<int[]> result = threeSum(array, 10);

		for (int[] a : result) {
			for (int v : a)
				System.out.print(v + ",");

			System.out.println();
		}

	}

}
