package leetcode.from103;

public class LeetCode_122 {
    public int maxProfit(int[] prices) {
        //找到所有升序子序列
        int res = 0;
        for (int i = 0;i<prices.length-1;i++){
           if(prices[i+1]>prices[i]){
               res +=prices[i+1]-prices[i];
           }
        }
        return res;
    }

}
