package com.tree2;


public class SymmetricTree {

	public static class TreeNode {
		int value;

		TreeNode left;

		TreeNode right;
	}
	
	public static boolean isSymmetricTree(TreeNode root)
	{
		if (root == null)
			return true;
		
		return isSameTree(root.left, root.right);
	}
	
	public static boolean isSameTree(TreeNode p1,TreeNode p2)
	{
		if (p1 == null && p2 == null)
			return true;
		else if (p1 == null || p2 == null)
			return false;
		else
			return isSameTree(p1.left,p2.left) && isSameTree(p1.right, p2.right);
	}
}
