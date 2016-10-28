package com.c2;

public class ClimbingStairs {
	
	public static int climbingStairs(int steps){
		
		if (steps == 0)
			return 0;
		
		if (steps == 1)
			return 1;
		
		if (steps == 2)
			return 2;
		
		return  climbingStairs(steps-1) + climbingStairs(steps-2);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(climbingStairs(5));
	}

}
