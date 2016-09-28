package com;

public class Threesum {

	public static void main(String[] args) {

		int[] array = new int[] { -1, -2, -3, -4, -5, -6, -7 };

		int target = -6;

		int[] ps = threeSum(array, target);

		for (int v : array) {
			System.out.print(v + ",");
		}

		System.out.println();

		System.out.println(ps[0] + "," + ps[1] + "," + ps[2]);
	}

	public static int[] threeSum(int[] array, int target) {
		int[] ps = new int[3];

		insertSort(array);

		int diff = Integer.MAX_VALUE;

		int len = array.length;

		loop: for (int i = 0; i < len - 2; i++) {
			int left = i + 1;
			int right = len - 1;
			while (left < right) {
				int sum = array[i] + array[left] + array[right];

				int range = Math.abs(target - sum);

				if (range == 0) {
					ps[0] = i;
					ps[1] = left;
					ps[2] = right;
					break loop;
				} else {
					if (range < diff) {
						diff = range;
						ps[0] = i;
						ps[1] = left;
						ps[2] = right;
					}

					if (sum < target)
						left++;
					else
						right--;
				}
			}
		}

		return ps;
	}

	public static void insertSort(int[] array) {

		for (int i = 1; i < array.length; i++) {
			int value = array[i];

			int p = i - 1;

			while (p >= 0) {

				if (array[p] > value) {
					array[p + 1] = array[p];

					p--;
				} else {
					break;
				}

			}

			array[p + 1] = value;

		}

	}

}
