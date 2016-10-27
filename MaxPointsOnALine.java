package com.c15;

public class MaxPointsOnALine {

	public static int maxPointsOnALine(int[][] points) {

		int maxNum = 0;

		for (int i = 0; i < points.length; i++) {

			for (int j = 0; j < points.length; j++) {

				int tmp = 2;

				if (j != i) {
					
					boolean isY = false;
					
					double xlv = 0;
					
					if (points[i][0] != points[j][0]){
						xlv = (points[i][1] - points[j][1]) / (points[i][0] - points[j][0]);
					}else{
						isY = true;
					}

					for (int k = 0; k < points.length; k++) {

						if (k != i && k != j) {
							if (isY){
								if (points[k][0] == points[i][0]){
									tmp++;
								}
							}else{
								if (xlv == (points[i][1] - points[k][1]) / (points[i][0] - points[k][0])){
									tmp++;
								}
							}
						}
					}

				}
				
				if (tmp > maxNum){
					maxNum = tmp;
				}

			}
		}
		
		return maxNum;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
