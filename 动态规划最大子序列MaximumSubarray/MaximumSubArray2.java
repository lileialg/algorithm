package com;

public class MaximumSubArray2 {

	public static int maximumSubarray(int[] array) {

		int maxValue = 0;

		for (int i = 0; i < array.length; i++) {

			int v = array[i];

			for (int j = i + 1; j < array.length && v + array[j] > 0; j++) {
				maxValue = Math.max(maxValue, v + array[j]);

				v = v + array[j];
			}

		}

		return maxValue;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		System.out.println(maximumSubarray(array));
	}

}
