package leetcode.from103;

import java.util.Arrays;
import java.util.List;

public class LeeyCode_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
       int mem[][] = new int[len][len];
       for(int i = 0;i<len;i++) {
           mem[len-1][i] = triangle.get(len-1).get(i);
       }
       for(int i = len -2 ;i>=0;i--){
           for(int j = 0;j<=i;j++){
               mem[i][j] = Math.min(mem[i+1][j],mem[i+1][j+1])+triangle.get(i).get(j);
           }
       }
       return mem[0][0];
    }
}
