
public class LeetCode_019 {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
		int length = 0,index = 1;
		ListNode tmp =head;
		while(tmp!=null) {
			length++;
			tmp = tmp.next;
		}
		if(n==length)return head.next;
		//int index = length-n;
		tmp = head;
		while(index<length-n) {
			tmp = tmp.next;
			index++;
		}
		tmp.next = tmp.next.next;
		return head;
	        
	    }
}
