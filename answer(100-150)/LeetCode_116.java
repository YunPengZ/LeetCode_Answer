package leetcode.from103;

import java.util.Stack;

public class LeetCode_116 {
        public Node connect(Node root) {
            Node level_start=root;
            while(level_start!=null){
                Node cur=level_start;
                while(cur!=null){
                    if(cur.left!=null) cur.left.next=cur.right;
                    if(cur.right!=null && cur.next!=null) cur.right.next=cur.next.left;

                    cur=cur.next;
                }
                level_start=level_start.left;
            }
            return root;


    }
}
