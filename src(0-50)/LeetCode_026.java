package linkedlist.leetcode.com;

import java.util.HashSet;

public class LeetCode_026 {
	public int removeDuplicates(int[] nums) {
       // int length = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0;i<nums.length;i++) {
        	set.add(nums[i]);
        }
        return set.size();
    }
}
