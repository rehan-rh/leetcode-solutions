class Solution {
    int f(int r, int c, int dp[][], int a[][])
    {
        if(r==0 && c==0) return 1;
        if(r<0 || c<0) return 0;
        if(a[r][c]==1) return 0;
        if(dp[r][c]!=-1) return dp[r][c];
        int t = f(r-1, c, dp, a);
        int l = f(r, c-1, dp, a);
        return dp[r][c] = t+l;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        if(obstacleGrid[n-1][m-1]==1 || obstacleGrid[0][0]==1) return 0;
        int dp[][] = new int[n][m];
        dp[0][0] = 1;
        for(int r=0 ; r<n ; r++)
        {
            for(int c=0 ; c<m ; c++)
            {
                if(r==0 && c==0)
                dp[r][c] = 1;
                else if(obstacleGrid[r][c]==1)
                dp[r][c] = 0;
                else{
                    int t = 0;
                    if(r>0) t = dp[r-1][c];
                    int l = 0;
                    if(c>0) l = dp[r][c-1];
                    dp[r][c] = t+l;
                }
            }
        }
        return dp[n-1][m-1];
    }
}