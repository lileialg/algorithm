package com;

import java.util.ArrayList;
import java.util.List;

public class MergeKSortLists {

	public static class Node {
		public int value;

		public Node next;

	}
	
	public static Node merge2List(Node node1,Node node2)
	{
		Node node = new Node();
		node.value = -1;
		
		Node header = node;
		
		while(node1!= null && node2!=null)
		{
			if (node1.value < node2.value){
				node.next = node1;
				node = node1;
				node1 = node1.next;
			}else{
				node.next = node2;
				node = node2;
				node2 = node2.next;
			}
		}
		
		if (node1 != null){
			node.next = node1;
		}else{
			node.next = node2;
		}
		
		return header.next;
	}
	
	public static Node mergeSort(List<Node> nodes)
	{
		
		if (nodes == null || nodes.size() == 0){
			return null;
		}
		
		if (nodes.size() == 1){
			return nodes.get(0);
		}
		
		Node node1 = mergeSort(nodes.subList(0, (nodes.size()-1)/2+1));
		
		Node node2 = mergeSort(nodes.subList((nodes.size()-1)/2+1, nodes.size()));
		
		
		return merge2List(node1, node2);
	}

	public static void main(String[] args)  {

		List<Node> nodes = new ArrayList<Node>();
		
		Node node = null;
		
		Node header = new Node();
		
		header.value = -1;
		
		for(int i=1;i<=50;i++){
			
			Node cur = new Node();
			
			cur.value = i;
			
			if (node != null){
				node.next = cur;
				
				node = node.next;
			}else{
				header.next = cur;
				
				node = cur;
			}
			
			if (i % 5 == 0){
				
				nodes.add(header.next);
				
				node = null;
				
				header = new Node();
				
				header.value = -1;
			}
			
		}
		
		
//		node = nodes.get(0);
//		
//		for(int i=1;i<nodes.size();i++)
//		{
//			node = merge2List(node, nodes.get(i));
//		}
		
		node = mergeSort(nodes);
		
		while(true){
			System.out.print(node.value+",");
			if (node.next == null){
				break;
			}else{
				node = node.next;
			}
		}
	}

}
