package com;

public class MiniMumPathSum {
	
	
	public static int minimumPathSum(int[][] matrix,int i,int j){
		
		if (i>0 && j>0){
			
			return Math.min(minimumPathSum(matrix,i-1,j), minimumPathSum(matrix,i,j-1)) + matrix[i][j];
			
		}else{
			
			if (i >0 ){
				return minimumPathSum(matrix,i-1,j) + matrix[i][j];
			}else if (j >0){
				return minimumPathSum(matrix,i,j-1) + matrix[i][j];
			}else{
				return matrix[0][0];
			}
			
		}
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(minimumPathSum(matrix,matrix.length-1,matrix[0].length-1));
	}

}
