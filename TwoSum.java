package com.c2;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSum(int[] array,int target){
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<array.length;i++){
			
			map.put(array[i], i);
			
		}
		
		for(int i=0;i<array.length;i++){
			
			if (map.containsKey(target - array[i])){
				return new int[]{i+1,map.get(target-array[i])+1};
			}
			
		}
		
		return null;
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[]{2,7,11,15};
		
		int[] result = twoSum(array,9);
		
		if (result != null){
			for(int v:result)
				System.out.print(v+",");
			
			System.out.println();
		}else{
			System.out.println("no data found");
		}
		
	}

}
