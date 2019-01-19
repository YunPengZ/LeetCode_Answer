package packag.start.from051.end;

public class LeetCode_063 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int [][]dp = new int[m][n];
        for(int i = 0;i<m;i++) {
        	for(int j = 0;j<n;j++) {
        		//if(obstacleGrid[m-i-1][n-j-1]!=1)
        			dp[i][j] = 1;
        	}
        }
        for(int i = 1;i<m;i++) {
        	for(int j =1;j<n;j++) {
        		if(obstacleGrid[i-1][j]!=1&&obstacleGrid[i][j-1]!=1) {
        			dp[i][j] = dp[i-1][j]+dp[i][j-1];
        		}else if(obstacleGrid[i][j-1]!=1&&obstacleGrid[i-1][j]==1) {
        			dp[i][j] = dp[i-1][j];
        		}else if(obstacleGrid[i-1][j]==1&&obstacleGrid[i][j-1]!=1) {
        			dp[i][j] = dp[i][j-1];
        		}else {
        			dp[i][j] = 0;
        		}
        	}
        }
        return dp[m-1][n-1];
    }
}
