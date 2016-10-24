package com;

public class MaxmumSubarray {
	
	public static int maxmumSubarray(int[] array){
		
		int maxValue = 0;
		
		int tmp = 0;
		
		for(int v:array){
			if (tmp + v>0){
				maxValue = Math.max(maxValue, tmp+v);
				tmp = tmp+v;
			}else{
				tmp = 0;
			}
		}
		
		return maxValue;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxmumSubarray(array));
	}

}
