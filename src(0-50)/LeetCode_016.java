import java.util.Arrays;

public class LeetCode_016 {
	/***
	 * 类似于015 对于某一个元素i 首先确定它的最接近target的数 然后在其中选择一个最大值；
	 * @param nums
	 * @param target
	 * @return
	 */
	public int threeSumClosest(int[] nums, int target) {
        int mostClosest = Integer.MAX_VALUE;
        int ClosestResult = 0;
        Arrays.sort(nums);
        //System.out.println(target);
        for(int i = 0;i<nums.length;i++) {
        	System.out.print(nums[i]);
		}
        
        for(int i = 0;i<nums.length-2;i++) {
        	int tmpClosest = Integer.MAX_VALUE,tmpResult = 0;
        	int low = i+1,high = nums.length-1;
        	while(low<high) {
        		int close = 0,closeResult=0;
        		//if(i==0||nums[low]!=nums[low+1]) {
    			closeResult = nums[low]+nums[high]+nums[i];
    			close = Math.abs(closeResult-target);
    			if(close<tmpClosest) {
    				tmpClosest = close;
    				tmpResult = closeResult;
    			}
    			if(closeResult>target)high--;
    			else if(closeResult == target) return closeResult;
    			else low++;
        		//}
        	}
        	if(tmpClosest<mostClosest) {
        		mostClosest = tmpClosest;
        		ClosestResult = tmpResult;
        	}
        
        }
        return ClosestResult;
    }
}
