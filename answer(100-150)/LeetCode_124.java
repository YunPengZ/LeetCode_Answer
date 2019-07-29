package leetcode.from103;

public class LeetCode_124 {
    int max_val;
    public int maxPathSum(TreeNode root) {
        max_val = Integer.MIN_VALUE;
        max_val = getMaxPath(root);
        return max_val;
    }

    private int getMaxPath(TreeNode root) {
        if(root==null)return 0;
        int left = Math.max(0,getMaxPath(root.left));
        int right = Math.max(0,getMaxPath(root.right));
        max_val = Math.max(max_val,left+right+root.val);
        return Math.max(left,right)+root.val;
    }
}
