package packag.start.from081;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_090 {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result  = new ArrayList<List<Integer>>();
		backtrack(result,new ArrayList<Integer>(),nums,0);
		return result;
    }

	private void backtrack(List<List<Integer>> result, ArrayList<Integer> arrayList, int[] nums,int start) {
		result.add(arrayList);
		for(int i = start;i<nums.length;i++) {
			if(i>start&&nums[i]==nums[i-1])continue;
			arrayList.add(nums[i]);
			backtrack(result, arrayList, nums, start+1);
			arrayList.remove(arrayList.size()-1);//删除已添加的元素 遍历更多可能
		}
	}	
}
