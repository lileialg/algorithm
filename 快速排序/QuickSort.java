package com;

public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int array[] = new int[]{6,6,6,6,6,6,6,6,6,6,5,9,4,4,8,4,2,1,212,1,2};
		
		sort(array,0,array.length-1);
		
		for(int v: array){
			System.out.print(v+",");
		}
	}

	public static void sort(int[] array, int start, int end) {

		if (start >= 0 && end < array.length && start < end) {

			int value = array[start];

			int left = start + 1;

			int right = end;

			while (left < right) {
				while ( array[left] <= value && left < right) {
					left++;
				}

				while ( array[right] > value && left < right) {
					right--;
				}

				if (left < right) {
					int temp = array[left];

					array[left] = array[right];

					array[right] = temp;
				}
			}

			if (array[left] < value) {
				int temp = array[left];

				array[left] = value;

				array[start] = temp;

				sort(array, start, left - 1);

				sort(array, left + 1, end);
			} else {
				int temp = array[left - 1];

				array[left - 1] = value;

				array[start] = temp;

				sort(array, start, left - 2);

				sort(array, left, end);
			}

		}

	}

}
