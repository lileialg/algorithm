package chapter3;

public class ConstructBinTreeFromPostorderAndInorder {

	public static int idx = 1;

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void solution(int[] postArray, int[] inArray, int start, int end, TreeNode p) {

		if (start <= end) {

			TreeNode np = new TreeNode(postArray[idx]);

			int pos = getPos(inArray, np.val, start, end);

			idx--;

			if (p.val > postArray[idx]) {
				// left

				p.left = np;

				p = np;

				solution(postArray, inArray, start, pos - 1, p);
			} else {

				p.right = np;

				p = np;

				solution(postArray, inArray, pos + 1, end, p);

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
		
		int[] postArray = new int[8];
		
		idx = postArray.length -2;
		
		TreeNode root = new TreeNode(postArray[idx+1]);
		
		solution(postArray,inArray,0,inArray.length,root);
	}
}
