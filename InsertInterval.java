package com.c15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertInterval {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static List<int[]> insertInterval(List<int[]> list,int[] m){
		List<int[]> newList = new ArrayList<int[]>();
		
		if (list==null){
			if (m != null){
				newList.add(m);
				
			}
			
			return newList;
		}
		
		if (m==null)
			return newList;
		
		for(int i=0;i<list.size();i++){
			if (m[0] <= list.get(i)[0]){
				
				list.add(i, m);
				
			}
		}
		
		LinkedList<int[]> link = new LinkedList<int[]>(list);
		
		while(link.size()>1){
			
			int[] p1 = link.pop();
			int[] p2 = link.pop();
			
			if (p1[1] >= p2[0]){
				link.push(new int[]{p1[0],Math.max(p1[1],p2[1])});
			}else{
				link.push(p2);
				newList.add(p1);
			}
			
			
			
		}
		
		newList.addAll(link);
		
		
		
		return newList;
	}
	
}
