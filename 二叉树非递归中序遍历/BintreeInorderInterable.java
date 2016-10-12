package com.tree2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BintreeInorderInterable {

	public static class TreeNode{
		int value;
		
		TreeNode left;
		
		TreeNode right;
	}
	
	public static List<Integer> inorder(TreeNode root)
	{
		
		List<Integer> list = new ArrayList<Integer>();
		
		if (root == null)
			return list;
		
		TreeNode p = root;
		
		Stack<TreeNode> s = new Stack<TreeNode>();
		
		
		while(!s.isEmpty() || p!= null)
		{
			if (p != null){
				s.push(p);
				
				p = p.left;
			}else{
				p = s.pop();
				
				list.add(p.value);
				
				p = p.right;
			}
			
			
		}
		
		return list;
	}
}
