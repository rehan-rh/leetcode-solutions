class Solution {
    int f(int r, int c, int dp[][], int a[][])
    {
        if(r==0 && c==0) return 1;
        if(r<0 || c<0) return 0;
        if(a[r][c]==1) return 0;
        if(dp[r][c]!=-1) return dp[r][c];
        int up = f(r-1, c, dp, a);
        int left = f(r, c-1, dp, a);
        return dp[r][c] = up+left;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1 || obstacleGrid[n-1][m-1]==1) return 0;
        int dp[][] = new int[n][m];
        for(int a[]:dp) Arrays.fill(a, -1);
        return f(n-1, m-1, dp, obstacleGrid);
    }
}