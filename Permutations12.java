package com.volienceenum;

public class Permutations12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = new int[]{1,2,2,3};
		
		test(array);
		
	}
	
	public static boolean isIncre(int[] array){
		
		for(int i=0;i<array.length-1;i++){
			if (array[i] > array[i+1])
				return false;
		}
		
		return true;
	}
	
	public static boolean isDesc(int[] array){
		for(int i=0;i<array.length-1;i++){
			if (array[i] < array[i+1])
				return false;
		}
		
		return true;
	}

	public static void display(int[] array){
		for(int v: array)
			System.out.print(v+",");
		System.out.println();
	}
	
	public static void test(int[] array){
		
		if (isIncre(array)){
			//output
			display(array);
			int p1 = array.length -1;
			while(array[p1-1] == array[p1])
				p1--;
			int tmp = array[p1];
			array[p1] = array[p1-1];
			array[p1-1] = tmp;
			test(array);
		}else if (isDesc(array)){
			//output
			display(array);
		}else{
			display(array);
			if (array[array.length-1] > array[array.length-2]){
				int tmp = array[array.length-1];
				array[array.length-1] = array[array.length-2];
				array[array.length-2] = tmp;
				test(array);
			}else{
				
//				if (array[0] == 2 && array[1] ==3 && array[2] ==4 && array[3]==1){
//					System.out.println("fuck");
//				}
				
				int p1 = array.length-1;
				
				while(array[p1-1] >= array[p1])
					p1--;
				
				//ÅÅĞò(p1,array.length-1)
				int sum = p1 + array.length-1;
				int mid = sum / 2;
				for(int i=p1;i<=mid;i++){
					int tmp1 = array[i];
					array[i] = array[sum-i];
					array[sum-i] = tmp1;
				}
				
				
				//½»»»(p1-1,p1)
				for(int i=p1;i<array.length;i++){
					if (array[i]>array[p1-1]){
						int tmp1 = array[i];
						array[i] = array[p1-1];
						array[p1-1] = tmp1;
						break;
					}
				}
				
				
				
				
				
				
				
				test(array);
			}
		}
		
	}
}
