package com.tree2;


public class BinaryTreeMaximumPathNum {

	private static int num = Integer.MIN_VALUE;
	
	public static class TreeNode {
		int value;

		TreeNode left;

		TreeNode right;
	}
	
	public static int binaryTreeMaximumPathNum(TreeNode p)
	{
		if (p == null)
			return 0;
		
		int leftNum = binaryTreeMaximumPathNum(p.left);
		
		int rightNum = binaryTreeMaximumPathNum(p.right);
		
		int currentVal = p.value;
		
		currentVal = Math.max( Math.max(leftNum + currentVal, rightNum + currentVal),currentVal);
		
		currentVal = Math.max(currentVal, currentVal + leftNum + rightNum);
		
		num = Math.max(num, currentVal);
		
		return num;
	}
	
}
