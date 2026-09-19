class Solution {
    int f(int r, int c, int dp[][], List<List<Integer>> t)
    {
        int n = t.size();
        if(r==n-1)
        {
            return t.get(r).get(c);
        }
        if(dp[r][c]!=(int)1e9) return dp[r][c];
        int b = f(r+1, c, dp, t);
        int br = f(r+1, c+1, dp, t);
        return dp[r][c] = t.get(r).get(c) + Math.min(b, br);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int dp[][] = new int[n][n];
        for(int a[] : dp) Arrays.fill(a, (int)1e9);
        return f(0, 0, dp, triangle);
    }
}