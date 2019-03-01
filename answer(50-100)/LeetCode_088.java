package packag.start.from081;

import java.util.Arrays;

public class LeetCode_088 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0;i<n;i++) {
        	nums1[m+i] = nums2[i];
        }
        Arrays.parallelSort(nums1);
    }
}
