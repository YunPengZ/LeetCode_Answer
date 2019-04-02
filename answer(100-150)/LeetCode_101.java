package fudan.edu.cn.answer;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode_101 {
    public boolean isSymmetric(TreeNode root) {
        return root==null||isSymmetricTool(root.left,root.right);
    }

    private boolean isSymmetricTool(TreeNode left, TreeNode right) {
        if(left==null||right==null)return left==right;
        if(left.val!=right.val)return false;
        return isSymmetricTool(left.left, right.right)&&isSymmetricTool(left.right,right.left);
    }
}
