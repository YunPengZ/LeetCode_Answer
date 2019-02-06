package packag.start.from065.end;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_077 {
	 public List<List<Integer>> combine(int n, int k) {
	        List<List<Integer>> list = new ArrayList<List<Integer>>();
	        int[] nums = new int[n];
	        for(int i=0;i<n;i++)nums[i]=i+1;
	        backtrack(list,new ArrayList<Integer>(),nums,k);
	        return list;
	    }

	private void backtrack(List<List<Integer>> list, ArrayList<Integer> arrayList, int[] nums, int k) {
		// TODO Auto-generated method stub
		if(arrayList.size()==k)list.add(new ArrayList<Integer>(arrayList));
		//else if(arrayList.contains())
		else {
			int index = arrayList.size()==0?0:arrayList.get(arrayList.size()-1);
			for(int i = index;i<nums.length;i++) {
				if(arrayList.contains(nums[i]))continue;
				arrayList.add(nums[i]);
				backtrack(list,arrayList,nums,k);
				arrayList.remove(arrayList.size()-1);
			}
		}
	}
}
