class Solution {
    int f(int r, int c, int dp[][], List<List<Integer>> t)
    {
        int n = dp.length;
        if(r==n-1) return t.get(r).get(c);
        if(dp[r][c]!=Integer.MIN_VALUE) return dp[r][c];
        int d = f(r+1, c, dp, t);
        int dl = f(r+1, c+1, dp, t);
        return dp[r][c] = t.get(r).get(c)+Math.min(d, dl);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int dp[][] = new int[n][n];
        for(int a[]:dp) Arrays.fill(a, Integer.MIN_VALUE);
        return f(0, 0, dp, triangle);
    }
}