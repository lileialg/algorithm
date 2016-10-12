package com.tree2;


public class GetBinaryTreeHeight {

	public static class TreeNode {
		int value;

		TreeNode left;

		TreeNode right;
	}
	
	
	public static int getHeightTree(TreeNode p)
	{
		if (p == null)
			return 0;
		
		else
			return Math.max(getHeightTree(p.left), getHeightTree(p.right)) + 1;
	}
}
