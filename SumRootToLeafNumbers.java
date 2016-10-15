package com.tree2;

public class SumRootToLeafNumbers {

	private static int sum = 0;

	public static class TreeNode {
		int value;

		TreeNode left;

		TreeNode right;
	}

	public static void sumRootToLeafNumbers(TreeNode p, int val) {
		
		if (p == null)
			return;
		
		if (p.left == null && p.right == null)
			sum += val;

		else {
			if (p.left != null) {
				val += p.left.value * 10;
				sumRootToLeafNumbers(p.left, val);
			}

			if (p.right != null) {
				val += p.right.value * 10;
				sumRootToLeafNumbers(p.right, val);
			}
		}

	}

}
