package packag.start.from051.end;

import string.leetcode.com.ListNode;

public class LeetCode_061 {
	public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = new ListNode(0),pre;
        dummy.next = head;
        pre = head;
        if(head==null)return null ;
        int len = 0;
        while(pre!=null) {
        	len++;
        	pre = pre.next;
        }
        k = k%len;
        pre = head;
        for(int i = 0;i+k<len;i++) {
        	pre = pre.next;
        }
        ListNode tempPre,tempEnd,nextStart = pre.next;
        tempPre = pre;
        
        tempEnd = nextStart;
        while(tempPre.next!=null) {
        	tempEnd = tempEnd.next;
        	tempPre = tempEnd;
        }
        tempPre.next = head;
        pre.next = null;
       // dummy.next = nextStart;
        return nextStart;
    }
}
