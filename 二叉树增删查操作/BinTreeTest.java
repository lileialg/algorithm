package com;

public class BinTreeTest {

	public static class BinNode {

		public double value;

		public BinNode left;

		public BinNode right;

		public BinNode(double value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {
		BinNode root = init();

		BinNode minNode = findMin(root.right);

		System.out.println(minNode.value);
		
		remove(10,root);
	}

	public static BinNode init() {
		BinNode root = new BinNode(10);

		root.left = new BinNode(5);

		BinNode right2 = new BinNode(15);

		root.right = right2;

		BinNode left3 = new BinNode(12);

		right2.left = left3;

		BinNode right3 = new BinNode(18);

		right2.right = right3;

		BinNode left4 = new BinNode(11);

		left3.left = left4;

		BinNode right4 = new BinNode(14);

		left3.right = right4;

		BinNode right5 = new BinNode(11.5);

		left4.right = right5;

		return root;
	}

	public static BinNode findMin(BinNode node) {

		while (node.left != null) {
			node = node.left;
		}

		return node;

	}

	public static BinNode remove(double value, BinNode node) {

		if (node == null) {
			return null;
		}

		double diff = node.value - value;

		if (diff > 0) {
			remove(value, node.left);
		} else if (diff < 0) {
			remove(value, node.right);
		} else if (node.left != null && node.right != null) {
			node.value = findMin(node.right).value;
			node.right = remove(node.value, node.right);
		} else {
			node = node.left != null ? node.left : node.right;
		}

		return node;
	}
	
	public static BinNode insert(BinNode node,double value) throws Exception
	{
		if (node == null){
			return new BinNode(value);
		}
		
		if (node.value == value){
			throw new Exception("已存在异常");
		}else{
			if (node.value > value){
				if (node.left != null){
					return insert(node.left,value);
				}else{
					BinNode newNode = new BinNode(value);
					
					node.left = newNode;
					
					return newNode;
				}
			}else{
				if (node.right != null){
					return insert(node.right,value);
				}else{
					BinNode newNode = new BinNode(value);
					
					node.right = newNode;
					
					return newNode;
				}
			}
		}
	}
	
	public static boolean contain(BinNode node,double value)
	{
		if (node == null){
			return false;
		}
		
		if (node.value == value){
			return true;
		}else{
			if (node.value > value){
				return contain(node.left,value);
			}else{
				return contain(node.right,value);
			}
		}
	}

}
