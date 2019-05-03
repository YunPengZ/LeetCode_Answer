package leetcode.from103;

import java.util.*;

public class LeetCode_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null)return res;
        queue.offer(root);
        int sz = 1;
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i<sz;i++){
                TreeNode head = queue.poll();
                list.add(head.val);
                if(head.left!=null)queue.offer(head.left);
                if(head.right!=null)queue.offer(head.right);
            }
            sz = queue.size();
            res.add(list);
        }
        Collections.reverse(res);
        return res;
    }
}
