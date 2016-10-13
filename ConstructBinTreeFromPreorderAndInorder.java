package chapter3;

import chapter3.ConstructBinTreeFromPostorderAndInorder.TreeNode;

public class ConstructBinTreeFromPreorderAndInorder {

	public static int idx = 1;

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void solution(int[] preArray, int[] inArray, int start, int end, TreeNode p) {

		if (start <= end) {

			TreeNode np = new TreeNode(preArray[idx]);

			int pos = getPos(inArray, np.val, start, end);

			idx++;

			if (p.val > preArray[idx]) {
				// left

				p.left = np;

				p = np;

				solution(preArray, inArray, start, pos - 1, p);
			} else {

				p.right = np;

				p = np;

				solution(preArray, inArray, pos + 1, end, p);

			}

		}

	}

	public static int getPos(int[] inArray, int value, int start, int end) {
		int mid = (start + end) / 2;

		if (value == inArray[mid])
			return mid;
		else if (value > inArray[mid])
			return getPos(inArray, value, mid + 1, end);
		else
			return getPos(inArray, value, start, mid - 1);
	}

	public static void main(String[] args) {
		int[] inArray = new int[8];
		
		int[] preArray = new int[8];
		
		
		TreeNode root = new TreeNode(preArray[0]);
		
		solution(preArray,inArray,0,inArray.length,root);
	}
}
