package com;

public class UniquePaths1 {
	
	private static int path = 1;
	
	public static void uniquePaths(int x,int y,int ex,int ey){
		if (x < ex && y <ey){
			
			uniquePaths(x+1,y,ex,ey);
			uniquePaths(x,y+1,ex,ey);
			path++;
		}
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uniquePaths(1,1,7,3);
		
		System.out.println(path);
	}

}
