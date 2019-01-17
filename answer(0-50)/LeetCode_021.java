package linkedlist.leetcode.com;
import string.leetcode.com.ListNode;;
public class LeetCode_021 {
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode eval1 = l1,eval2 = l2,result,tmp;
		 if(l1==null)return l2;
	        if(l2==null)return l1;
		if(eval1.val<eval2.val) {
			result = eval1;
			eval1 = eval1.next;
		}else {
			result = eval2;
			eval2 = eval2.next;
		}
		tmp = result;
		while(eval1!=null&&eval2!=null) {
			if(eval1.val<eval2.val) {
				tmp.next = eval1;
				tmp = tmp.next;
				eval1 = eval1.next;
			}else {
				tmp.next = eval2;
				tmp = tmp.next;
				eval2 = eval2.next;
			}
			
		}
		while(eval1!=null) {
			tmp.next = eval1;
			tmp = tmp.next;
			eval1 = eval1.next;
		}while(eval2!=null) {
			tmp.next = eval2;
			tmp = tmp.next;
			eval2 = eval2.next;
		}
		return result;
	 }
		
}
