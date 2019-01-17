package linkedlist.leetcode.com;

public class LeetCode_027 {
	public int removeElement(int[] nums, int val) {
		int lens = nums.length;
		for(int i = 0;i<nums.length;i++) {
			if(nums[i]==val)lens--;
		}
		return lens;
	}
}
