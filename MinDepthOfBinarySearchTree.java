package com.tree2;


public class MinDepthOfBinarySearchTree {

	public static class TreeNode {
		int value;

		TreeNode left;

		TreeNode right;
	}
	
	public static int minDepthOfBinarySearchTree(TreeNode p){
		
		if (p == null) 
			return 0;
		
		if (p.left == null && p.right == null)
			return 0;
		
		
		return Math.min(minDepthOfBinarySearchTree(p.left),minDepthOfBinarySearchTree(p.right)) + 1;
	}
}
