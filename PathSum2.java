package com.tree2;

import java.util.List;


public class PathSum2 {
	public static class TreeNode {
		int value;

		TreeNode left;

		TreeNode right;
	}
	
	public static void pathSum(TreeNode p,int target,List<Integer> subList,List<List<Integer>> list){
		
		if (p != null){
			if (p.left != null && p.right != null){
				if (p.value < target)
				{
					subList = subList.subList(0, subList.size());
					subList.add(p.value);
					pathSum(p.left,target - p.value,subList,list) ;
					pathSum(p.right,target -p.value,subList,list);
				}
			}else{
				if (p.left != null){
					if (p.value < target)
					{
						subList = subList.subList(0, subList.size());
						subList.add(p.value);
						pathSum(p.left,target - p.value,subList,list) ;
					}
				}
				
				if (p.right != null){
					if (p.value < target)
					{
						subList = subList.subList(0, subList.size());
						subList.add(p.value);
						pathSum(p.right,target -p.value,subList,list);
					}
				}
				
				if (p.value == target)
				{
					subList = subList.subList(0, subList.size());
					subList.add(p.value);
					list.add(subList);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
