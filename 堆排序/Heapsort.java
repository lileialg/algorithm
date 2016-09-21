package com;

public class Heapsort {

	public static void main(String[] args) {
		int[] array = new int[] { 6, 7, 2, 1, 5, 9, 8, 3 };
		
		initHeap(array);
		
		sort(array);
		
		for (int v : array) {
			System.out.print(v + ",");
		}
	}
	
	
	public static void initHeap(int[] array){
		for (int i = 0; i < array.length; i++) {
			int temp = array[i];

			int pos = i;

			while (true) {
				int last = -1;

				if (pos % 2 == 0) {

					last = pos / 2 - 1;

				} else {
					last = pos / 2;
				}

				if (last >= 0 && array[last] < temp) {

					int tmp = array[last];
					array[last] = array[pos];
					array[pos] = tmp;
					pos = last;

				} else {
					break;
				}
			}

		}
	}
	
	public static void sort(int[] array){
		for (int i = array.length - 1; i > 0; i--) {

			int temp = array[i];
			array[i] = array[0];
			array[0] = temp;

			int pos = 0;

			while (true) {

				int left = pos * 2 + 1;
				int right = pos * 2 + 2;

				if (left >= i) {
					break;
				}

				if (temp < array[left] || temp < array[right]) {

					if (right < i) {
						if (array[left] > array[right]) {
							int tmp = array[left];
							array[left] = array[pos];
							array[pos] = tmp;

							pos = left;
						} else {
							int tmp = array[right];
							array[right] = array[pos];
							array[pos] = tmp;

							pos = right;
						}
					} else {
						if (temp < array[left]) {
							int tmp = array[left];
							array[left] = array[pos];
							array[pos] = tmp;

							pos = left;
						} else {
							break;
						}
					}

				} else {
					break;
				}

			}

		}
	}

}
