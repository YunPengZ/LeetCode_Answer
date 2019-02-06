package packag.start.from065.end;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_078 {
	public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<Integer>(), nums, 0);
    return list;
}

private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
    list.add(new ArrayList<Integer>(tempList));
    for(int i = start; i < nums.length; i++){
        tempList.add(nums[i]);
        backtrack(list, tempList, nums, i + 1);
        tempList.remove(tempList.size() - 1);
    }
}
}
