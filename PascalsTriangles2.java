package com.c15;

import java.util.Arrays;

public class PascalsTriangles2 {
	
	public static int[] pascalsTriangle(int index){
		
		int[] data = new int[index+1];
		
		Arrays.fill(data, 1);
		
		for(int i=1;i<index;i++){
			
			for(int j=i;j>0;j--){
				data[j] = data[j] + data[j-1];
			}
			
		}
		
		return data;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = pascalsTriangle(5);
		
		for(int v:a)
			System.out.print(v+",");
	}

}
