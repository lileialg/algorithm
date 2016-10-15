package com.tree2;


public class PathSum1 {
	public static class TreeNode {
		int value;

		TreeNode left;

		TreeNode right;
	}
	
	public static boolean pathSum(TreeNode p,int target){
		
		if (p == null)
			return false;
		
		if (p.left != null && p.right != null){
			if (p.value >= target)
				return false;
			else
			{
				return pathSum(p.left,target - p.value) || pathSum(p.right,target -p.value);
			}
		}else{
			if (p.left != null){
				if (p.value >= target)
					return false;
				else
				{
					return pathSum(p.left,target - p.value) ;
				}
			}
			
			if (p.right != null){
				if (p.value >= target)
					return false;
				else
				{
					return pathSum(p.right,target -p.value);
				}
			}
			
			if (p.value == target)
				return true;
			else
				return false;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
