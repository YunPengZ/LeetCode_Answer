package packag.start.from081;

public class LeetCode_083 {
	 public ListNode deleteDuplicates(ListNode head) {
	        ListNode dummy = new ListNode(0);
	        ListNode pre,now,next;
	        dummy.next = head;
	        pre = dummy;
	        now = head;
	        while(now!=null) {
	        	next = now.next;
	        	if(next!=null&&now.val==next.val) pre.next = now.next;
	        	else pre = pre.next;
	        	now = now.next;
	        }
	        return dummy.next;
	    }
}
