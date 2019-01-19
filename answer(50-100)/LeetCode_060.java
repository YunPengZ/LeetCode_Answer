package packag.start.from051.end;

import java.util.List;
import java.util.ArrayList;

public class LeetCode_060 {
	 public String getPermutation(int n, int k) {
		 	if(n<=1)return String.valueOf(n);
	        List<List<Integer>> list = new ArrayList<List<Integer>>();
	        int[] nums = new int[n];
	        for(int i = 0;i<n;i++) {
	        	nums[i] = i+1;
	        }
	        //¼ÆËãkµÄÎ»ÖÃ;
	        int n_multi = 1;
	        for(int i = 1;i<n;i++) {
	        	n_multi *=i;
	        }
	        int first_num = k/n_multi;
	        //int temp = nums[0];
	        nums[0] = first_num;
	        nums[first_num] = 1;
	        StringBuilder bf = new StringBuilder();
	        bf.append(nums[0]);
	        backtrack(list,new ArrayList<Integer>(),nums);
	        
	        for(int i :list.get( k%n_multi-1)) {
	        	bf.append(i);
	        }
	        return bf.toString();
	 }

	private  void  backtrack(List<List<Integer>> list, ArrayList<Integer> temp, int[] nums) {
		if(temp.size()==nums.length-1) {
			list.add(new ArrayList<Integer>(temp));
			return ;
		}else {
			for(int i = 1;i<nums.length;i++) {
				if(temp.contains(nums[i]))continue;
				temp.add(nums[i]);
				backtrack(list,temp,nums);
				temp.remove(temp.size()-1);
			}
		}
	}
}
