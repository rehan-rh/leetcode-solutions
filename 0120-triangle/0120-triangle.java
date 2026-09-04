class Solution {
    int f(int r, int c, int dp[][], List<List<Integer>> t)
    {
        int n = dp.length;
        if(r==n-1) return t.get(r).get(c);
        if(dp[r][c]!=Integer.MAX_VALUE) return dp[r][c];
        int d = f(r+1, c, dp, t);
        int dl = f(r+1, c+1, dp, t);
        return dp[r][c] = t.get(r).get(c)+Math.min(d, dl);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int dp[][] = new int[n][n];
        for(int i=0 ; i<n ; i++)
        {
            dp[n-1][i] = triangle.get(n-1).get(i);
        }
        for(int r=n-2 ; r>=0 ; r--)
        {
            for(int c=r ; c>=0 ; c--)
            {
                int d = dp[r+1][c];
                int dl = dp[r+1][c+1];
                dp[r][c] = triangle.get(r).get(c)+Math.min(d, dl);
            }
        }
        return dp[0][0];
    }
}