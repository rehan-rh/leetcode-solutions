class Solution {
    int f(int r, int c, int dp[][], int a[][])
    {
        if(r==0 && c==0) return a[0][0];
        if(r<0 || c<0) return (int)1e9;
        if(dp[r][c]!=-1) return dp[r][c];
        int top = f(r-1, c, dp, a);
        int left = f(r, c-1, dp, a);
        return dp[r][c] = a[r][c] + Math.min(top, left);

    }
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][] = new int[n][m];
        dp[0][0] = grid[0][0];
        for(int r=0 ; r<n ; r++)
        {
            for(int c=0 ; c<m ; c++)
            {
                if(r==0 && c==0)
                dp[r][c] = grid[0][0];
                else
                {
                    int top = (int)1e9;
                    if(r>0) top = dp[r-1][c];
                    int left = (int)1e9;
                    if(c>0) left = dp[r][c-1];
                    dp[r][c] = grid[r][c] + Math.min(top, left);
                }
            }
        }
        return dp[n-1][m-1];
    }
}