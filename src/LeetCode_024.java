package linkedlist.leetcode.com;

import string.leetcode.com.ListNode;

public class LeetCode_024 {
	 public ListNode swapPairs(ListNode head) {
	 	/***
	 	 * ÿ������㽻��һ�Σ�����ֻ����ֵ��
	 	 */
	 	ListNode left,right,tmp,nextLeft,dummy;
	 	if(head==null||head.next==null)return head;
	 	dummy = new ListNode(0);//ͷָ��
	 	dummy.next = head;
	 	tmp = dummy;
	 	nextLeft = head;
	 	while(nextLeft!=null) {
	 		left = nextLeft;
	 		if(left.next == null) return dummy.next;
	 		right = left.next;
		 	nextLeft = right.next;
		 	//swap left,right;
		 	tmp.next = right;
		 	//tmp = right;
		 	right.next = left;
		 	left.next = nextLeft;
		 	tmp = left;
	 	}
	 	
	 	
        return dummy.next;
	   }
}
