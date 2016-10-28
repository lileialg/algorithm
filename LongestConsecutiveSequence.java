package com.c2;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static int longestConsecutiveSequence(int[] array){
		Set<Integer> set = new HashSet<Integer>();
		
		for(int v:array)
			set.add(v);
		
		int maxValue = 0;
		
		for(int v:array){
			
			int num = 0;
			
			int n = v;
			
			while(set.contains(n)){
				num++;
				set.remove(n);
				n--;
			}
			
			n = v+1;
			
			while(set.contains(n)){
				num++;
				set.remove(n);
				n++;
			}
			
			if (num>maxValue)
				maxValue = num;
			
		}
		
		return maxValue;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[]{100,4,200,1,3,2};
		
		System.out.println(longestConsecutiveSequence(array));
	}

}
