package com.tree2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class BintreePostorderInterable {

	public static class TreeNode{
		int value;
		
		TreeNode left;
		
		TreeNode right;
	}
	
	public static List<Integer> postorder(TreeNode root)
	{
		List<Integer> list = new ArrayList<Integer>();
		
		if (root ==null)
			return list;
		
		TreeNode p = root;
		
		Stack<TreeNode> s = new Stack<TreeNode>();
		
		while(true){
			if (p != null){
				
				if (p.right != null)
					s.push(p.right);
				
				s.push(p);
				
				p = p.left;
				
				continue;
				
			}
			
			if (s.isEmpty())
				break;
			
			p = s.pop();
			
			if (p.right != null && !s.isEmpty() && s.peek() == p.right){
				s.pop();
				
				s.push(p);
				
				p = p.right;
				
			}else{
				list.add(p.value);
				
				p = null;
			}
			
			
		}
		
		return list;
	}
}
