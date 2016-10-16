package threads;

public class InsertSortList {

	static class LinkedNode {
		int val;

		LinkedNode next;

		public LinkedNode(int val) {
			this.val = val;
		}
	}

	public static LinkedNode insertSortList(LinkedNode head) {
        
        if(head == null) return null;
        if(head.next == null) return head;
        
        final LinkedNode _head = new LinkedNode(Integer.MIN_VALUE);
        _head.next = head;
        
        head = head.next;
        _head.next.next = null;
        
        next:
        while(head != null){
            
            LinkedNode taken = head;
            head = head.next;
            
            
            LinkedNode cur = _head.next;
            LinkedNode last = _head;
            
            
            while(cur != null){
                
                if(cur.val > taken.val){
                    // insert
                    last.next = taken;
                    taken.next = cur;
                    
                    continue next;
                    
                }
                
                cur  = cur.next;
                last = last.next;
            }
            
            last.next = taken;
            taken.next = null;

        }
        
        
        return _head.next;
        
    }

	public static void main(String[] args) {

		LinkedNode p1 = new LinkedNode(3);

		p1.next = new LinkedNode(2);

		p1.next.next = new LinkedNode(1);

		LinkedNode p = insertSortList(p1);
		
		System.out.println(p.next.val);
	}

}
