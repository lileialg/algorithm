package com.tree2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UniqueBinarySearchTree2 {

	
	public static class TreeNode {
		int value;

		TreeNode left;

		TreeNode right;
	}
	
	public static List<TreeNode> uniqueBinarySearchTree(int[] array){
		
		List<TreeNode> roots = new ArrayList<TreeNode>();
		
		if (array == null || array.length ==0) {
			roots.add(null);
			
			return roots;
		}
		
		
		
		for(int i=0;i<array.length;i++){
			
			for(TreeNode left : uniqueBinarySearchTree(Arrays.copyOfRange(array, 0, i))){
				
				for(TreeNode right:uniqueBinarySearchTree(Arrays.copyOfRange(array, i+1, array.length))){
					
					TreeNode root = new TreeNode();
					
					root.value = array[i];
					
					root.left = left;
					
					root.right = right;
					
					roots.add(root);
				}
			}
			
		}
		
		return roots;
		
	}
	
	public static void main(String[] args) {
		int[] array = new int[4];
		
		for(int i=0;i<array.length;i++){
			array[i] = i+1;
		}
		
		List<TreeNode> roots = uniqueBinarySearchTree(array);
		
		System.out.println(roots.size());
	}
	
}
