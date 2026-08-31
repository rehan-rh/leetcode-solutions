class Solution {
    int f(int r, int c, int dp[][], int a[][])
    {
        if(r==0 && c==0)
        return a[0][0];
        if(r<0 || c<0) return Integer.MAX_VALUE;
        if(dp[r][c]!=-1) return dp[r][c];
        int up = f(r-1, c, dp, a);
        int left = f(r, c-1, dp, a);
        return dp[r][c] = a[r][c] + Math.min(up, left);
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        dp[0][0] = grid[0][0];
        for(int r=0 ; r<m ; r++)
        {
            for(int c=0 ; c<n ; c++)
            {
                if(r==0 && c==0)
                dp[r][c] = grid[0][0];
                else
                {
                    int up = Integer.MAX_VALUE;
                    int left = Integer.MAX_VALUE;
                    if(r>0) up = dp[r-1][c];
                    if(c>0) left = dp[r][c-1];
                    dp[r][c] = grid[r][c] + Math.min(up, left);
                }
            }
        }
        return dp[m-1][n-1];
    }
}