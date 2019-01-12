package linkedlist.leetcode.com;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class LeetCode_033 {
	public int search(int[] nums, int target) {
		//先找到数组中最小的元素
		int lo = 0,hi = nums.length-1;
		while(lo<hi) {
			int mid = (lo+hi)/2;
			if(nums[hi]<nums[mid])lo = mid+1;
			else hi = mid;
		}
		int pivot = lo;
		lo = 0;
		hi = nums.length-1;
		 while(lo<=hi){
	            int mid=(lo+hi)/2;
	            int realmid=(mid+pivot)%nums.length;
	            if(nums[realmid]==target)return realmid;
	            if(nums[realmid]<target)lo=mid+1;
	            else hi=mid-1;
	        }
		 return -1;
    }	
}
