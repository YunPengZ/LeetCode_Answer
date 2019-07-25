package leetcode.from103;

import java.util.Arrays;
import java.util.Collection;

public class LeetCode_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return getBST(nums,0,nums.length-1);
    }

    private TreeNode getBST(int[] nums, int start, int end) {
        if(start>end)return null;
        int mid = (end+start)/2;
       // int mid = (int)Math.ceil((end+start)/2.0);
        TreeNode head  = new TreeNode(nums[mid]);
        head.left = getBST(nums,start,mid-1);
        head.right = getBST(nums,mid+1,end);
        return head;
    }
}
