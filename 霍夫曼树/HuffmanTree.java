package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HuffmanTree {


	static class Node{
		char code;
		
		int weight;
		
		Node left;
		
		Node right;
	}
	
	public static void sort(List<Node> nodes){
		Collections.sort(nodes, new Comparator<Node>(){
			
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				return o1.weight - o2.weight;
			}
		});
	}
	
	public static Node createHuffmanTree(List<Node> nodes){
		
		//取出最小的两个
		Node left = nodes.get(0);
		
		Node right = nodes.get(1);
		
		Node parent = new Node();
		
		parent.weight = left.weight + right.weight;
		
		parent.left = left;
		
		parent.right = right;
		
		for(int i=2;i<nodes.size();i++){
			
			Node node = nodes.get(i);
			Node tmpParent = new Node();
			tmpParent.weight = parent.weight + node.weight;
			if (node.weight > parent.weight){
				tmpParent.left = parent;
				tmpParent.right = node;
			}else{
				tmpParent.left = node;
				tmpParent.right = parent;
			}
			
			parent = tmpParent;
			
		}
		
		return parent;
		
	}
	
	
	public static void getCodes(Node node,Map<Character,String> map,String pri){
		
		if (node.left != null && node.right != null){
			getCodes(node.left,map,pri +"0");
			getCodes(node.right,map,pri +"1");
		}else{
			map.put(node.code, pri);
		}
		
		
	}
	
	public static String encoder(String str,Map<Character,String> map){
		
		StringBuilder sb = new StringBuilder();
		
		char[] cs = str.toCharArray();
		
		for(char c: cs){
			sb.append(map.get(c));
		}
		
		return sb.toString();
	}
	
	public static String decoder(String str,Node node){
		StringBuilder sb = new StringBuilder();
		
		char[] cs = str.toCharArray();
		
		for(int i=0;i<cs.length;){
			
			
			
			Node tmp = node;
			
			while (tmp.left != null) {
				char c = cs[i];
				
				if ('0' == c) {
					tmp = tmp.left;
					
				}
				if ('1' == c) {
					tmp = tmp.right;
				}
				
				i++;
			}
			
			sb.append(tmp.code);
		}
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Node> nodes = new ArrayList<Node>();
		
		Node n = new Node();
		
		n.code = 'A';
		
		n.weight = 43;
		
		nodes.add(n);
		
		n = new Node();
		
		n.code = 'B';
		
		n.weight = 14;
		
		nodes.add(n);
		
		n = new Node();
		
		n.code = 'C';
		
		n.weight = 29;
		
		nodes.add(n);
		
		n = new Node();
		
		n.code = 'D';
		
		n.weight = 14;
		
		nodes.add(n);
		
		sort(nodes);

		Node root = createHuffmanTree(nodes);
		
		Map<Character,String> map = new HashMap<Character,String>();
		getCodes(root,map,"");
		
		String encoderStr = encoder("ABACCDA",map);
		
		System.out.println(encoderStr);
		
		String decoderStr = decoder(encoderStr,root);
		
		System.out.println(decoderStr);
	}

}
