package com;

public class Triangle {


	public static int triangle(int[][] array){
		
		
		int[] s = new int[array.length];
		
		for(int i=0;i<s.length;i++){
			s[i] = array[s.length-1][i];
		}
		
		for(int i=array.length-2;i>=0;i--){
			int[] tmp = array[i];
			
			for(int j=0;j<tmp.length;j++){
				s[j] = Math.min(s[j], s[j+1])+tmp[j];
			}
		}
		
		return s[0];
		
	}
	
	public static void main(String[] args) {

		int[][] array = new int[][]{{2},{3,4},{6,5,7},{4,1,8,3}};
		
		System.out.println(triangle(array));
	}

}
