package linkedlist.leetcode.com;

public class LeetCode_034 {
	public int[] searchRange(int[] nums, int target) {
        //同样的search
	 
	 int lo = 0,hi = nums.length-1;
	 int []result = {-1,-1};
	 while(lo<=hi) {
		 int mid = (lo+hi)/2;
		 if(nums[mid]==target) {
            //System.out.println(mid);
			 if(mid>0&&nums[mid-1]==nums[mid]) {
				 //遍历左边和右边
				 while(mid>0&&nums[mid-1]==nums[mid])mid--;
                 result[0] = mid;
                 while(mid<nums.length-1&&nums[mid]==nums[mid+1])mid++;
				 result[1] = mid;
			 }else if(mid<nums.length-1&&nums[mid]==nums[mid+1]) {
				 while(mid>0&&nums[mid-1]==nums[mid])mid--;
                 result[0] = mid;
                 while(mid<nums.length-1&&nums[mid]==nums[mid+1])mid++;
				 result[1] = mid;
			 }else {
				 result[0] = mid;
				 result[1] = mid;
			 }
			 break;
		 }else if(nums[mid]<target)lo = mid+1;
		 else hi = mid-1;
	 }
	 return result;
 }
}
