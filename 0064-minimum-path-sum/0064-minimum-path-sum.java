class Solution {
    int f(int r, int c, int dp[][], int a[][])
    {
        if(r==0 && c==0) return a[0][0];
        if(r<0 || c<0) return Integer.MAX_VALUE;
        if(dp[r][c]!=-1) return dp[r][c];
        int up = f(r-1, c, dp, a);
        int left = f(r, c-1, dp, a);
        return dp[r][c] = a[r][c] + Math.min(up, left);
    }
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][] = new int[n][m];
        for(int a[]:dp) Arrays.fill(a, -1);
        return f(n-1, m-1, dp, grid);
    }
}