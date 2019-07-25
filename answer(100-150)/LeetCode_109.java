package leetcode.from103;

public class LeetCode_109 {
    public TreeNode sortedListToBST(ListNode head) {
        int len = 0;
        ListNode p = head;
        while(p!=null){
            p = p.next;
            len++;
        }
       return getBST(head,len);

    }

    private TreeNode getBST(ListNode head, int len) {
        if(head==null||len<1)return null;
        if(len==1)return new TreeNode(head.val);
        int i = 0;
        ListNode p = head;
        while(i++<len/2){
            p = p.next;
        }

        TreeNode node = new TreeNode(p.val);
        node.left = getBST(head,len/2);
        node.right = getBST(p.next,len-len/2);
        return node;
    }
}
