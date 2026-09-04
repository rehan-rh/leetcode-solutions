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
        for(int a[] : dp) Arrays.fill(a, -1);
        return f(m-1, n-1, dp);
    }
}