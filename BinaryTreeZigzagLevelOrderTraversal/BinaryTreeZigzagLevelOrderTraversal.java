package com.tree2;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {

	public static class TreeNode {
		int value;

		TreeNode left;

		TreeNode right;
	}

	public static List<List<Integer>> zigzag(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();

		if (root == null)
			return list;

		TreeNode end = new TreeNode();

		Deque<TreeNode> d = new LinkedList<TreeNode>();

		d.addLast(root);

		d.addLast(end);

		List<Integer> levelList = new ArrayList<Integer>();

		boolean flag = true;

		while (!d.isEmpty()) {

			TreeNode p = d.poll();

			if (p == end) {
				list.add(levelList);

				levelList = new ArrayList<Integer>();

				d.add(end);

				if (flag)
					flag = false;
				else
					flag = true;
			} else {

				if (!flag) {

					if (p.left != null)
						d.addLast(p.left);

					if (p.right != null)
						d.addLast(p.right);
				} else {
					if (p.right != null)
						d.addLast(p.right);
					if (p.left != null)
						d.addLast(p.left);

				}
			}

		}

		return list;

	}
}
