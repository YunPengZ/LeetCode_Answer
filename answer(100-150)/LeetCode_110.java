package leetcode.from103;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class LeetCode_110 {
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        if(isBalanced(root.left)&&isBalanced(root.right)){
            if(Math.abs(height(root.left)-height(root.right))<=1)
                return true;
        }
        return false;

    }

    private int height(TreeNode node) {
        if(node==null)return 0;
        return Math.max(height(node.left),height(node.right))+1;
    }
}
