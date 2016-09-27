package com;

import java.util.Random;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int array[] = new int[100];

		Random r = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(100);
		}

		int aux[] = new int[array.length];

		sort(array, aux, 0, (0 + array.length - 1) / 2, array.length - 1);

		for (int a : array) {
			System.out.print(a + ",");
		}
		
		System.out.println();
		
		System.out.println(isSorted(array));

	}

	public static void sort(int array[], int aux[], int low, int mid, int high) {

		if (array == null || array.length == 0 || aux == null
				|| aux.length != array.length) {
			return;
		}

		if (mid - low > 1) {
			sort(array, aux, low, (low + mid) / 2, mid);
		} else {
			if (mid - low == 1) {
				if (array[mid] < array[low]) {
					int dummy = array[low];
					array[low] = array[mid];
					array[mid] = dummy;
				}
			}
		}

		if (high - (mid + 1) > 1) {
			sort(array, aux, mid + 1, (high + mid + 1) / 2, high);
		} else {
			if (high - (mid + 1) == 1) {
				if (array[high] < array[mid + 1]) {
					int dummy = array[high];
					array[high] = array[mid + 1];
					array[mid + 1] = dummy;
				}
			}
		}

		merge(array, aux, low, mid, high);
	}

	public static void merge(int[] array, int[] aux, int low, int mid, int high) {
		int start = low;

		int mid2 = mid + 1;

		for (int i = low; i <= mid; i++) {

			if (mid2 <= high) {

				for (int j = mid2; j <= high; j++) {

					if (array[j] < array[i]) {

						aux[start++] = array[j];

						if (j == high) {
							mid2 = high + 1;
						}
					} else {
						mid2 = j;

						aux[start++] = array[i];

						break;
					}

				}

				if (mid2 > high) {
					aux[start++] = array[i];
				}
			} else {
				aux[start++] = array[i];
			}

		}

		for (int i = low; i < start; i++) {
			array[i] = aux[i];
		}
	}
	
	
	public static boolean isSorted(int array[]){
		
		if (array == null || array.length ==0){
			return false;
		}
		
		int p = 0;
		
		while(true)
		{
			if (p >= array.length-1){
				break;
			}
			
			if (array[p] > array[p+1]){
				return false;
			}
			
			p++;
		}
		
		return true;
	}

}
