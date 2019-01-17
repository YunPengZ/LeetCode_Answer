package packag.start.from051.end;

public class LeetCode_053 {
	 public int maxSubArray(int[] nums) {
		//if(nums.length==1)return nums[0];
		int []dp = new int[nums.length];
		dp[0] = nums[0];
		int maxRes = dp[0];
		for(int i = 1;i<nums.length;i++) {
			dp[i] = nums[i]+(dp[i-1]>0?dp[i-1]:0);
			maxRes = Math.max(maxRes, dp[i]);
		}//dp µþ¼Ó ºÜ²»´í
		return maxRes;
	 }
}
