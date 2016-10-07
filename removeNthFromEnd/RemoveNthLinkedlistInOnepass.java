package chapter3;

public class RemoveNthLinkedlistInOnepass {
	
	public static class Node{
		
		public int value;
		
		public Node next;
		
	}
	

	public static void main(String[] args) {

		Node header = init();
		
		Node node = header;
		
		while(node != null)
		{
			System.out.print(node.value+"---->");
			
			node = node.next;
		}
		
		System.out.println();
		
		node = removeNth(header, 10);
		
		while(node != null)
		{
			System.out.print(node.value+"---->");
			
			node = node.next;
		}
		
		System.out.println();
	}
	
	public static Node init()
	{
		Node cur = new Node();
		
		Node header = cur;
		
		Node next = null;
		
		int n = 1;
		
		while(n<=10){
			cur.value = n;
			
			if (n<10)
			
				next = new Node();
			else
				next = null;
			
			cur.next = next;
			
			cur = next;
			
			n++;
		}
		
		return header;
	}
	
	
	public static Node removeNth(Node header,int n)
	{
		
		if (header == null)
			throw new IllegalArgumentException();
		
		Node pre = null;
		
		Node cur = header;
		
		Node fast = header;
		
		for(int i=0;i<n;i++){
			fast = fast.next;
		}
		
		
		while(fast != null)
		{
			fast = fast.next;
			
			pre = cur;
			
			cur = cur.next;
		}
		
		
		if (pre == null)
		{
			return header.next;
		}else{
			pre.next = cur.next;
			return header;
		}
		
	}

}
