package com;

public class Froyd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] array2dim = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i != j) {
					array2dim[i][j] = Integer.MAX_VALUE;
				}
			}
		}

		array2dim[0][1] = 100;

		array2dim[1][2] = 10;

		array2dim[0][3] = 70;

		array2dim[3][2] = 80;

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {

				if (i != j) {
					for (int k = 0; k < 4; k++) {
						if (i != k && j != k
								&& array2dim[i][k] != Integer.MAX_VALUE
								&& array2dim[k][j] != Integer.MAX_VALUE) {
							if (array2dim[i][j] > (array2dim[i][k] + array2dim[k][j])) {
								array2dim[i][j] = array2dim[i][k]
										+ array2dim[k][j];
							}

						}
					}
				}

			}
		}

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {
				System.out.println(i+"---->"+j+":"+(array2dim[i][j] == Integer.MAX_VALUE?"²»Í¨ÐÐ":String.valueOf(array2dim[i][j])));
			}
		}
	}

}
