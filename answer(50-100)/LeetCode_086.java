package packag.start.from081;

public class LeetCode_086 {
	public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(0);
        ListNode left,RightPre,Right,p;
        left =dummy;
        p= head;
        RightPre = new ListNode(0);
        Right = RightPre;
        while(p!=null) {
        	if(p.val>=x) {
        		Right.next = p;
        		Right = Right.next;
        		
        	}else {
        		left.next = p;
        		left = left.next;
        	}
        	p = p.next;
        }
        Right.next = null;
        left.next = RightPre.next;
        return dummy.next;
    }
}
