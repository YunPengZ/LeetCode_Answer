package packag.start.from035.end;

public class LeetCode_035 {
	public int searchInsert(int[] nums, int target) {
		int lo = 0,hi = nums.length-1;
		//�ҵ���һ����С��target��Ԫ��
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(nums[mid]==target)return mid;
			else if(nums[mid]<target)lo = mid+1;
			else hi = mid-1;
		}
		return lo;
	}
}
