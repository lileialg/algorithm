package com.tree2;

import java.util.ArrayList;
import java.util.List;


public class ConvertSortedListToBinarySearchTree {

	public static class TreeNode {
		int value;

		TreeNode left;

		TreeNode right;
	}
	
	public static class LinkedNode{
		
		int value;
		
		LinkedNode next;
	}
	
	public static TreeNode convertSortedListToBinarySearchTree(LinkedNode start,LinkedNode end)
	{
		TreeNode p = new TreeNode();
		
		if (start == end) {
			p.value = start.value;
			
			return p;
		}
		
		
		List<LinkedNode> list = getMidNode(start,end);
		
		p.value = list.get(1).value;
		
		p.left = convertSortedListToBinarySearchTree(start,list.get(0));
		
		p.right = convertSortedListToBinarySearchTree(list.get(2),end);
		
		return p;
	}
	
	public static List<LinkedNode> getMidNode(LinkedNode start,LinkedNode end){
		
		LinkedNode preSlow = null;
		
		LinkedNode slow = start;
		
		LinkedNode postSlow = null;
		
		LinkedNode fast = start;
		
		while(fast.next != end){
			preSlow = slow;
			
			slow = slow.next;

			postSlow = slow.next;
			
			fast = fast.next.next;
		}
		
		List<LinkedNode> list = new ArrayList<LinkedNode>();
		
		list.add(preSlow);
		
		list.add(slow);
		
		list.add(postSlow);
		
		return list;
		
	}
	
	public static void main(String[] args) {
		LinkedNode start = null;
		
		LinkedNode end = start;
		
		while(end.next != null) 
			end = end.next;
		
		
		TreeNode root = convertSortedListToBinarySearchTree(start,end);
		
	}
}
