package com;

public class ScrambleString {
	
	public static class Node{
		String value;
		
		Node left;
		
		Node right;
		
		Node(String value){
			this.value = value;
		}
		
	}
	
	public static Node scrambleString(String str){
		
		if (str == null)
			return null;
		
		
		int len = str.length();
		
		if (len == 1)
			return new Node(str);
		
		
		
		Node node = new Node(str);
		
		String strLeft = str.substring(0,len/2);
		
		String strRight = str.substring(len/2);
		
		node.left = scrambleString(strLeft);
		
		node.right = scrambleString(strRight);
		
		
		return node;
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
