package packag.start.from065.end;

public class LeetCode_075 {
	 public void sortColors(int[] nums) {
		 int start=0,end = nums.length-1;
	     for(int i = 0;i<nums.length;i++) {
	    	 while(nums[i]==2&&i<end) {
	    		 int temp = nums[end];
	    		 nums[end--] = nums[i];
	    		 nums[i] = temp;
	    		 
	    	 }
	    	 while(nums[i]==0&&i>start) {
	    		 int temp = nums[start];
	    		 nums[start++] = nums[i];
	    		 nums[i] = temp;
	    	 }
	    	 
	     }
	 }
}
