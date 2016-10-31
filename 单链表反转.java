package com;

import java.util.Random;

public class ReverseLinkedNodeApp {
	
	private static class Node{
		
		Node next;
		
		int value;
		
	}
	
	static Node reverse(Node node){
		
		if (node == null) return null;
		
		Node p = node;
		
		Node pre = null;
		
		while(p!= null){
			if (p.next != null){
				
				Node next = p.next;
				
				p.next =pre;
				
				pre = p;
				
				p = next;
				
			}else{
				p.next = pre;
				
				return p;
				
			}
		}
		
		return null;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node node = new Node();
		
		node.value = 1;
		
		Node curNode = node;
		
		int num = 40;
		
		Random rand = new Random();
		
		while(num-->0){
			Node newNode = new Node();
			
			newNode.value = rand.nextInt(100
					);
			
			curNode.next = newNode;
			
			curNode = curNode.next;
			
		}
		
		curNode = node;
		
		while(curNode != null){
			System.out.print(curNode.value+",");
			curNode = curNode.next;
			
		}
		
		System.out.println();
		
		node = reverse(node);
		
		while(node != null){
			System.out.print(node.value+",");
			node = node.next;
			
		}
		
		System.out.println();
		
	}

}
