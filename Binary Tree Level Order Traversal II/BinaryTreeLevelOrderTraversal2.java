package com.tree2;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class BinaryTreeLevelOrderTraversal2 {

	public static class TreeNode{
		int value;
		
		TreeNode left;
		
		TreeNode right;
	}
	
	public static Stack<List<Integer>> binaryTreeLevelOrderTraversal(TreeNode root)
	{
		Stack<List<Integer>> list = new Stack<List<Integer>>();
		
		if (root == null)
			return list;
		
		
		TreeNode end = new TreeNode();
		
		Deque<TreeNode> d = new LinkedList<TreeNode>();
		
		d.addLast(root);
		
		d.addLast(end);
		
		List<Integer> levelList = new ArrayList<Integer>();
		
		while(!d.isEmpty())	{
			
			TreeNode p = d.poll();
			
			if (p == end){
				list.push(levelList);
				
				levelList = new ArrayList<Integer>();
				
				d.add(end);
			}else{
				if (p.left != null)
					d.addLast(p.left);
				
				if (p.right != null)
					d.addLast(p.right);
			}
			
		}
		
		return list;
		
	}
	
	public static void main(String[] args) {

		
	}

}
