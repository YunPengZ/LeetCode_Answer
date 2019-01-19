package packag.start.from051.end;

public class LeetCode_062 {
	 public int uniquePaths(int m, int n) {
	 	if(m>n)return uniquePaths(n, m);
       int[] dp = new int[m];
       for(int i = 0;i<m;i++) {//µ¹Ðò  
    	   dp[i] = 1;	    	   
       }
       for(int j = 1;j<n;j++) {//µ¹Ðò
    	   for(int i = 1;i<m;i++) {
    		   //dp[i][j] = dp[i-1][j]+dp[i][j-1];
    		   dp[i] +=dp[i-1];
    	   }
       }
       return dp[m-1];
	    }
}
