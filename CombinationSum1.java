package com;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {


	public static void combinationSum(int p,int target,int[] array,List<Integer> subList,List<List<Integer>> list){
		
		if (target == 0){
			list.add(subList);
		}else{
			for(int pos=p;pos<=array.length;pos++) {
				int value = array[pos - 1];
				if (target >= value) {
					int time = target / value;

					for (int i = 1; i <= time; i++) {

						int tmp = target;

						List<Integer> newList = new ArrayList<Integer>();

						for (int v : subList)
							newList.add(v);

						for (int j = 1; j <= i; j++) {
							newList.add(value);
							tmp = tmp - value;
						}

						combinationSum(pos + 1, tmp, array, newList, list);

					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) {

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		int[] array = new int[]{2,3,6,7};
		
		combinationSum(1, 15, array, new ArrayList<Integer>(), list);
		
		for(List<Integer> subList : list){
			for(int v:subList)
				System.out.print(v+",");
			
			System.out.println();
		}
	}

}
