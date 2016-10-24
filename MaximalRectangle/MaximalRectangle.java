package com;

public class MaximalRectangle {

	public static int maximalRectangle(int[][] matrix) {
		int maxArea = 0;

		int rowLen = matrix.length;
		int colLen = matrix[0].length;

		for (int i = 0; i < rowLen; i++) {

			for (int j = 0; j < colLen; j++) {

				loop: for (int r = i; r < rowLen; r++) {

					if (matrix[r][j] != 1)
						break;

					for (int c = j; c < colLen; c++) {
						if (matrix[r][c] != 1)
							continue loop;

						maxArea = Math.max(maxArea, (r - i + 1) * (c - j + 1));

					}
				}

				// }
			}

		}

		return maxArea;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = new int[][] { { 0, 1, 1 }, { 1, 1, 1 }, { 1, 1, 0 },
				{ 1, 1, 0 }, { 1, 1, 0 }, { 1, 1, 0 } };

		System.out.println(maximalRectangle(matrix));
	}

}
