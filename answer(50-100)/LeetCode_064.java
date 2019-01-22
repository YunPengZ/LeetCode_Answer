package packag.start.from051.end;

public class LeetCode_064 {
	public int minPathSum(int[][] grid) {
		if(grid.length==0)return 0;
		int m = grid.length;
		if(grid[0].length==0)return 0;
		int n = grid[0].length;
        int[] dp = new int[m*n];
        for(int i = 0;i<m;i++) {
        	for(int j = 0;j<n;j++) {
        		if(i==0) {
        			if(j==0)dp[0] = grid[0][0];
        			else dp[j] = grid[0][j]+dp[j-1];
        		}
        		else if(j==0)dp[i*m] = grid[i][0]+dp[(i-1)*m];
        		else dp[i*m+j] = Math.min(dp[(i-1)*m+j], dp[i*m+j-1])+grid[i][j];
        	}
        }
        return dp[m*n-1];
    }
}
