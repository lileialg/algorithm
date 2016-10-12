package com.tree2;


public class BinaryTreeSame {

	public static class TreeNode {
		int value;

		TreeNode left;

		TreeNode right;
	}
	
	public static boolean sameTree(TreeNode p1,TreeNode p2)
	{
		if (p1 == null && p2 == null)
		{
			return true;
		}else if (p1 ==null || p2 == null ){
			return false;
		}else{
			if (p1.value != p2.value){
				return false;
			}else{
				
				return sameTree(p1.left,p2.left) && sameTree(p1.right,p2.right);
				
			}
		}
	}
}
