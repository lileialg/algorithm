package com.tree2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BintreePreorderInterable {

	public static class TreeNode {
		int value;

		TreeNode left;

		TreeNode right;
	}

	public static List<Integer> preorder(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();

		if (root == null)
			return list;

		Stack<TreeNode> s = new Stack<TreeNode>();
		
		s.push(root);
		
		while(!s.isEmpty()){
			
			TreeNode p = s.pop();
			
			list.add(p.value);
			
			if (p.right != null)
				s.push(p.right);
			
			if (p.left != null)
				s.push(p.left);
			
		}
		
		return list;
	}
}
