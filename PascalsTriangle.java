package com.c15;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	
	public static List<List<Integer>> pascalsTriangle( int numRows){
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		List<Integer> lastList = new ArrayList<Integer>();
		
		for(int i=1;i<=numRows;i++){
			if (i==1){
				lastList.add(1);
				
				list.add(lastList);
			}else{
				List<Integer> newList = new ArrayList<Integer>();
				
				for(int j=0;j<i;j++){
					if (j ==0){
						newList.add(1);
					}else if (j+1==i){
						newList.add(1);
					}else{
						newList.add(lastList.get(j-1) + lastList.get(j));
					}
				}
				
				list.add(newList);
				
				lastList = newList;
				
			}
		}
		
		return list;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list = pascalsTriangle(5);
		
		for(List<Integer> subList: list){
			for(int v:subList)
				System.out.print(v+",");
			
			System.out.println();
		}
	}

}
