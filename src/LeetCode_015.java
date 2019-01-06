import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode_015 {
	public List<List<Integer>> threeSum(int[] nums) {
        //Set<List<Integer>> sets = new HashSet<List<Integer>>();
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-2;i++) {
        	//找到两个数，和与i的值为相反数；对单个元素i左右一起找
        	if(i==0||(i>0 && nums[i] != nums[i-1])) {
        		int low = i+1,high = nums.length-1;
            	while(low<high) {
            		if(nums[low]+nums[high]+nums[i]==0) {
            			//System.out.println("the test case");
            			lists.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[low],nums[high])));
            			while(low<high&&nums[low]==nums[low+1])low++;
            			while(low<high&&nums[high]==nums[high-1])high--;
            			low++;
            			high--;
            		}else if(nums[low]+nums[high]+nums[i]<0)low++;
            		else high--;
            	}
        	}
        	
        }
        return lists;
    }
}
