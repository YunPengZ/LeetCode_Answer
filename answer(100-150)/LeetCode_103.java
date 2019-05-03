package leetcode.from103;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode_103 {
    /***
     * @author YunPengZ
     * 层序遍历二叉树
     * level order traverse
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null)return  result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode last = root;
        boolean order = true;
        int sz= 1;
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i<sz;i++){
                TreeNode head = queue.poll();
                if(order){
                    list.add(head.val);

                }else{
                    list.add(0,head.val);
                }
                if(head.left!=null)queue.offer(head.left);
                if(head.right!=null)queue.offer(head.right);
            }
            result.add(list);
            sz = queue.size();
            order = !order;
        }
        return result;
    }
}
