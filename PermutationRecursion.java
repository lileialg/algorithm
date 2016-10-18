package com.volienceenum;

public class PermutationRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[]{1,2,3,4};
		
		permutation(array,0,array.length-1);
	}
	
	
	public static void permutation(int[] array,int start,int end){
		
		if (start == end){
			for(int v: array)
				System.out.print(v+",");
			
			System.out.println();
		}else{
			for(int i=start;i<=end;i++){
				int tmp = array[start];
				array[start] = array[i];
				array[i] = tmp;
				permutation(array,start+1,end);
				tmp = array[start];
				array[start] = array[i];
				array[i] = tmp;
			}
		}
		
	}

}
