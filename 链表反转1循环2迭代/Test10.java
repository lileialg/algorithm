package com;

import java.util.ArrayList;
import java.util.List;

public class Test10 {

	public static class Node {

		private Node next;

		private int value;

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

	}

	public static class Linked {

		private Node header;

		public Linked() {

		}

		public Linked(Node header) {
			this.header = header;
		}

		public void init(List<Node> nodes) throws Exception {
			if (nodes == null || nodes.size() == 0) {
				throw new Exception("no data to init");
			}

			this.setHeader(nodes.get(0));

			Node preNode = this.getHeader();

			for (int i = 1; i < nodes.size(); i++) {
				preNode.setNext(nodes.get(i));
				preNode = nodes.get(i);
			}

		}

		public Node getHeader() {
			return header;
		}

		public void setHeader(Node header) {
			this.header = header;
		}

	}

	public static void reverse1(Linked linked) {

		if (linked != null && linked.getHeader() != null) {

			Node pre = null;

			Node cur = linked.getHeader();

			while (cur != null) {
				Node nextNode = cur.getNext();

				cur.setNext(pre);

				pre = cur;

				if (nextNode != null) {

					cur = nextNode;

				} else {

					linked.setHeader(cur);

					break;
				}
			}

		}

	}

	public static void reverse2(Linked linked) {

		if (linked != null && linked.getHeader()!=null)
		{
			Node cur = linked.getHeader();
			
			cur = next(linked,cur);
			
			cur.setNext(null);
		}
	}
	
	public static Node next(Linked linked,Node cur)
	{
		if (cur.getNext()!=null){
			
			Node nextNode = next(linked,cur.getNext());
			
			nextNode.setNext(cur);
			
			return cur;
			
		}else{
			linked.setHeader(cur);
			
			return cur;
		}
	}

	public static void main(String[] args) throws Exception {

		Linked linked = new Linked();
		
		List<Node> nodes = new ArrayList<Node>();
		
		for(int i=0;i<10;i++){
			Node node = new Node();
			
			node.setValue(i);
			
			nodes.add(node);
		}
		
		linked.init(nodes);
		
		display(linked);
		
		reverse1(linked);
		
		display(linked);
		
		System.out.println(linked.getHeader().getValue());
		
	}
	
	public static void display(Linked linked)
	{
		if (linked != null){
			Node cur = linked.header;
			
			while(cur!= null)
			{
				System.out.print(cur.getValue()+",");
				cur = cur.getNext();
			}
			System.out.println("---------------------------------");
		}
	}

}
