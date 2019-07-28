package leetcode.from103;

public class LeetCode_121 {
    public int maxProfit(int[] prices) {
      int min = Integer.MAX_VALUE;
      int max_v = 0;
      for(int i = 0;i<prices.length;i++){
          min = Math.min(min,prices[i]);
          max_v = Math.max(max_v,prices[i]-min);
      }
      return max_v;
    }
}
