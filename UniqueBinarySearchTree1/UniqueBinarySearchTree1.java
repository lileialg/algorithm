package com.tree2;

public class UniqueBinarySearchTree1 {

	
	public static int uniqueBinarySearchTree(int start,int end){
		
		if (start >= end){
			return 1;
		}else{
			int sum = 0;
			
			for(int i=start;i<=end;i++){
				sum+= uniqueBinarySearchTree(start,i-1) * 
						uniqueBinarySearchTree(i+1,end);
			}
			
			return sum;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(uniqueBinarySearchTree(1,4));
	}
	
}
