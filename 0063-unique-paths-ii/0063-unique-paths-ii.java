class Solution {
    int f(int r, int c, int dp[][], int a[][])
    {
        if(r>=0 && c>=0 && a[r][c]==1) return 0;
        if(r==0 && c==0) return 1;
        if(r<0 || c<0) return 0;
        if(dp[r][c]!=-1) return dp[r][c];
        int up = f(r-1, c, dp, a);
        int left = f(r, c-1, dp, a);
        return dp[r][c]=up+left;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        dp[0][0] = 1;
        for(int r=0 ; r<m ; r++)
        {
            for(int c=0 ; c<n ; c++)
            {
                if(r>=0 && c>=0 && obstacleGrid[r][c]==1)
                dp[r][c] = 0;
                else if(r==0 && c==0)
                dp[0][0] = 1;
                else
                {
                    int up = 0;
                    int left = 0;
                    if(r>0) up = dp[r-1][c];
                    if(c>0) left = dp[r][c-1];
                    dp[r][c] = up+left;
                }
            }
        }
        return dp[m-1][n-1];
    }
}