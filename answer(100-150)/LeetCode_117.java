package leetcode.from103;

public class LeetCode_117 {
    public Node connect(Node root) {
        Node first_node = root;
        Node pre = null;
        Node cur = root;
        while(cur!=null){
            while(cur!=null){
                if(cur.left!=null){
                    if(pre==null){
                        first_node = cur.left;
                    }else{
                        pre.next = cur.left;
                    }
                    pre = cur.left;
                }
                if(cur.right!=null){
                    if(pre==null){
                        first_node = cur.right;
                    }else{
                        pre.next = cur.right;
                    }
                    pre = cur.right;
                }
                cur = cur.next;
            }
            cur = first_node;
            pre = null;
            first_node = null;
        }
        return root;
    }
}
