package com.volienceenum;

public class Combinations {

	public static void main(String[] args) {
		
		combination(1,6,3,"");
		
	}
	
	
	public static void combination(int start,int num,int k,String str){
		
		if (k == 0){
			System.out.println(str);
		}else{
			
			for(int i=start;i<=(num - k + 1);i++){
				
				
				combination(i+1,num,k-1,str+","+i);
				
			}
			
		}
		
		
	}
	
}
