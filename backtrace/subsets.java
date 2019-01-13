package backtrack.leetcode.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets {
	public List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(list,new ArrayList<Integer>(),nums,0);
		return list;
	}

	private void backtrack(List<List<Integer>> list, ArrayList<Integer> arrayList, int[] nums, int start) {
		// TODO Auto-generated method stub
		list.add(new ArrayList<Integer>(arrayList));//��֮���remove�Խ��û��Ӱ��
		for(int i = start;i<nums.length;i++) {
			arrayList.add(nums[i]);
			backtrack(list, arrayList, nums, start+1);
			arrayList.remove(arrayList.size()-1);//ɾ������ӵ�Ԫ�� �����������
		}
	}
}
