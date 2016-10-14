package com.tree2;


public class ValidateBinarySearchTreeApp {

	public static class TreeNode {
		int value;

		TreeNode left;

		TreeNode right;
	}
	
	public static boolean validateBinarySearchTree(TreeNode p)
	{
		
		if (p == null) return true;
		
		if (p.left != null && p.right != null){
			if (p.left.value > p.value)
				return false;
			else if (p.right.value < p.value)
				return false;
			else
				return validateBinarySearchTree(p.left) && validateBinarySearchTree(p.right);
		}else if (p.left !=null || p.right!= null){
			if (p.left != null){
				if (p.left.value > p.value)
					return false;
				else
					return validateBinarySearchTree(p.left);
			}else{
				if (p.right.value < p.value)
					return false;
				else
					return validateBinarySearchTree(p.right);
			}
		}else{
			return true;
		}
		
	}
}
