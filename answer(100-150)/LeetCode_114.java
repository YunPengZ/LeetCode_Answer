package leetcode.from103;

import java.util.Stack;

public class LeetCode_114 {
    private TreeNode prev;
    public void flatten(TreeNode root) {
        if(root==null)return;
       flatten(root.right);
       flatten(root.left);
       root.right = prev;
       root.left = null;
       prev = root;
    }
}
