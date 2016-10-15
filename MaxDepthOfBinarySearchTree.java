package com.tree2;


public class MaxDepthOfBinarySearchTree {

	public static class TreeNode {
		int value;

		TreeNode left;

		TreeNode right;
	}
	
	public static int maxDepthOfBinarySearchTree(TreeNode p){
		
		if (p == null) 
			return 0;
		
		if (p.left == null && p.right == null)
			return 0;
		
		
		return Math.max(maxDepthOfBinarySearchTree(p.left),maxDepthOfBinarySearchTree(p.right)) + 1;
	}
}
