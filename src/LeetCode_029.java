package linkedlist.leetcode.com;

public class LeetCode_029 {
	  public int divide(int dividend, int divisor) {
	        int max_Integer =Integer.MAX_VALUE;
	        int min = Integer.MIN_VALUE;
	        int res = dividend/divisor;
	        if(dividend==min&&divisor==-1)res = max_Integer;
	        return res;
	    }
}
