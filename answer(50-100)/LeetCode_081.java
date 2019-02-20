package packag.start.from081;

public class LeetCode_081 {
	public boolean search(int[] nums, int target) {
		if(nums.length==0)return false;
		int flag = nums.length-1;
		boolean rotated = false;
        for(int i=0;i<nums.length;i++) {
        	if(i!=0&&nums[i-1]>nums[i]){
        		flag = i;
        		rotated = true;
        		break;
        	}
        }
        if(target==nums[0])return true;
        if(!rotated) return searchBy(nums,0,nums.length-1,target);
        else if(rotated&&target>nums[0])return searchBy(nums,0,flag-1,target);
        else return searchBy(nums,flag,nums.length-1,target);
    }

	private boolean searchBy(int[] nums,int left, int right,int target) {
		while(left<=right) {
			int mid = (left+right)/2;
			if(nums[mid]<target) left = mid+1;
			else if(nums[mid]>target)right = mid-1;
			else return true;
		}
		return false;
		
	}
}
