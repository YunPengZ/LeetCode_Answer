package packag.start.from035.end;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_041 {
	/***
	 * 对空间的要求 常数级别的空间占用 因此不能开辟新的数组 用当前的数组 
	 *其实相当于去除负数后排序
	 * @param nums
	 * @return
	 */
	   public int firstMissingPositive(int[] A) {
	        int i = 0;
	        while(i < A.length){
	            if(A[i] == i+1 || A[i] <= 0 || A[i] > A.length) i++;
	            else if(A[A[i]-1] != A[i]) swap(A, i, A[i]-1);
	            else i++;
	        }
	        i = 0;
	        while(i < A.length && A[i] == i+1) i++;
	        return i+1;
	    }
	    
	    private void swap(int[] A, int i, int j){
	        int temp = A[i];
	        A[i] = A[j];
	        A[j] = temp;
	    }
	   
}
