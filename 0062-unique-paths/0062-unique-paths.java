class Solution {
    int f(int r, int c, int dp[][])
    {
        if(r==0 && c==0) return 1;
        if(r<0 || c<0) return 0;
        if(dp[r][c]!=-1) return dp[r][c];
        int top = f(r-1, c, dp);
        int left = f(r, c-1, dp);
        return dp[r][c] = top+left;
    }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        dp[0][0] = 1;
        for(int r=0 ; r<m ; r++)
        {
            for(int c=0 ; c<n ; c++)
            {
                if(r==0 && c==0)
                dp[r][c] = 1;
                else
                {
                    int t = 0;
                    if(r>0)
                    t = dp[r-1][c];
                    int l = 0;
                    if(c>0)
                    l = dp[r][c-1];

                    dp[r][c] = t+l;
                }
            }
        }
        return dp[m-1][n-1];
    }
}