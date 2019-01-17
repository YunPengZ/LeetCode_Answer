package packag.start.from035.end;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_039 {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		//此类需要遍历所有元素的算法 应该首先考虑回溯法
		//回溯法真牛批
		Arrays.sort(candidates);
		backtracing(result,new ArrayList<Integer>(),candidates,0,target);
		return result;
		
    }

	private void backtracing(List<List<Integer>> result, ArrayList<Integer> arrayList, int[] candidates, int i,int remains) {
		// TODO Auto-generated method stub
		if(remains<0)return ;
		else if(remains==0)result.add(new ArrayList<Integer>(arrayList));
		//else if(remains==0)result.add(arrayList);
		else {
			for(int index = i;index<candidates.length;index++) {
				arrayList.add(candidates[index]);
				backtracing(result,arrayList,candidates,index,remains-candidates[index]);
				arrayList.remove(arrayList.size()-1);
			}
		}
		
	}
}
