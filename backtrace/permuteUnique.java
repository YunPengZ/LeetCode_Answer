package backtrack.leetcode.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class permuteUnique {
	public List<List<Integer>> permuteUnique(int[] nums){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(list,new ArrayList<Integer>(),nums,new boolean[nums.length]);
		return list;
	}
	private void backtrack(List<List<Integer>> list,List<Integer> temp,int[] nums,boolean[] visited) {
		if(temp.size()==nums.length)list.add(new ArrayList<Integer>(temp));
		else {
			for(int i = 0;i<nums.length;i++) {
				if(visited[i]||i>0&&nums[i]==nums[i-1]&&visited[i-1])continue;
				visited[i] = true;
				temp.add(nums[i]);
				backtrack(list,temp,nums,visited);
				visited[i] = false;
				temp.remove(temp.size()-1);
			}
		}
	}
}
