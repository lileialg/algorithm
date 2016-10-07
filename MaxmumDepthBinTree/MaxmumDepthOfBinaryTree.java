package chapter3;

public class MaxmumDepthOfBinaryTree {

	public static class BinTree{
		
		public int val;
		
		public BinTree left;
		
		public BinTree right;
		
		public BinTree(int val){this.val = val;}
		
	}
	
	public static int findMaxDepth(BinTree root)
	{
		if (root == null)
		{
			return 0;
		}
		
		return Math.max(findMaxDepth(root.left), findMaxDepth(root.right))+1;
	}
}
