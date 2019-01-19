package packag.start.from051.end;

public class LeetCode_055 {
	 public boolean canJump(int[] nums) {//¿‡À∆∑…––∆Â£ø
		 int iterator = 0;
		 int tempIndex = 0;
		 while(iterator++<=nums.length) {
			 if(tempIndex+nums[tempIndex]>=nums.length-1)return true;
			 int temp = tempIndex+nums[tempIndex];
			 int index = tempIndex;
			 for(int i = tempIndex;i<=nums[tempIndex]+tempIndex;i++) {
				if(nums[i]+i>temp) {
					temp = nums[i]+i;
					index = i;
				}
			 }
			 tempIndex = index;
		 }
		 return false;
	 }
}
