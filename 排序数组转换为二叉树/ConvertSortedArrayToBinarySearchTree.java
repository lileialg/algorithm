package com.tree2;


public class ConvertSortedArrayToBinarySearchTree {

	public static class TreeNode {
		int value;

		TreeNode left;

		TreeNode right;
	}
	
	public static TreeNode convertSortedArrayToBinarySearchTree(int[] array,int start,int end)
	{
		TreeNode p = new TreeNode();
		
		if (start == end) {
			p.value = array[start];
			
			return p;
		}
		
		int mid = (start + end) / 2;
		
		p.value = array[mid];
		
		p.left = convertSortedArrayToBinarySearchTree(array,start,mid-1);
		
		p.right = convertSortedArrayToBinarySearchTree(array,mid + 1,end);
		
		return p;
	}
	
}
