package com.tree2;

public class BalanceBinaryTree {

	public static class TreeNode {
		int value;

		TreeNode left;

		TreeNode right;
	}

	public static boolean isBalance(TreeNode p) {

		if (p == null)
			return true;
		else

			return isBalance(p.left) && isBalance(p.right)
					&& Math.abs(getHeight(p.left) - getHeight(p.right)) <= 1;
	}

	public static int getHeight(TreeNode p) {
		if (p == null)
			return 0;
		else
			return Math.max(getHeight(p.left), getHeight(p.right)) + 1;
	}
}
