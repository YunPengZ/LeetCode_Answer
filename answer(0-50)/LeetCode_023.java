package linkedlist.leetcode.com;

import java.util.Comparator;
import java.util.PriorityQueue;

import string.leetcode.com.ListNode;

public class LeetCode_023 {
	public ListNode mergeKLists(ListNode[] lists) {
	if(lists.length==0) {
		return null;
	}
	ListNode end = new ListNode(0),tmp;
	PriorityQueue<ListNode> result = new PriorityQueue<ListNode>(lists.length,new Comparator<ListNode>() {

		@Override
		public int compare(ListNode o1, ListNode o2) {
			// TODO Auto-generated method stub
			if(o1.val==o2.val)return 0;
			return o1.val<o2.val?-1:1;
			//return 0;
		}
		
	});
	for(ListNode eval:lists) {
		if(eval!=null) {
			result.add(eval);
			//eval = eval.next;
		}
	}
	end = new ListNode(0);
	tmp = end;
	while(!result.isEmpty()) {
		tmp.next = result.poll();
		tmp = tmp.next;
		if(tmp.next!=null)result.add(tmp.next);
	}
	return end.next;
	
	}

}
