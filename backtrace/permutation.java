package backtrack.leetcode.com;

import java.util.ArrayList;
import java.util.List;

public class permutation {
	public List<List<Integer>> permute(int[] nums) {
		   List<List<Integer>> list = new ArrayList<List<Integer>>();
		   // Arrays.sort(nums); // not necessary
		   backtrack(list, new ArrayList<Integer>(), nums);
		   return list;
		}

	private void backtrack(List<List<Integer>> list, ArrayList<Integer> arrayList, int[] nums) {
		// TODO Auto-generated method stub
		//所有元素从0开始
		if(arrayList.size()==nums.length){
			list.add(new ArrayList<Integer>(arrayList));
		}else {
			for(int i=0;i<nums.length;i++) {
				if(arrayList.contains(nums[i]))continue;
				arrayList.add(nums[i]);
				backtrack(list, arrayList, nums);
				arrayList.remove(arrayList.size()-1);
			}
		}
	}
}
