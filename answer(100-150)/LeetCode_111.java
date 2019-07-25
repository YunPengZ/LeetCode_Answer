package leetcode.from103;

import javax.swing.tree.TreeCellRenderer;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode_111 {
    public int minDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null)return 0;
        int level = 1;
        TreeNode lastEnd = root;
        queue.offer(root);
        while(root!=null&&!queue.isEmpty()){
            TreeNode top = queue.poll();
            if(top.left==null&&top.right==null){
                break;
            }
            if(top.left!=null)queue.offer(top.left);
            if(top.right!=null)queue.offer(top.right);
            if(top==lastEnd){
                lastEnd = top.right==null?top.left:top.right;
                level++;
            }
        }
        return level;
    }
}
