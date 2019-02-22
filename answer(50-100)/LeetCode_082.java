package packag.start.from081;

public class LeetCode_082 {
	public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next = head;
        ListNode pre,now,next;
        pre = dummy;now = pre.next;
        while(now!=null) {
        	next = now.next;
        	if(next!=null&&now.val==next.val)now = next;
        	else {
        		if(pre.next!=now) pre.next = next;
        		else pre = pre.next;
        		now = next;	
        	}
        }
        return dummy.next;
    }
}
