class Solution {
    int f(int ind, int dp[])
    {
        if(ind<=2) return ind;
        if(dp[ind]!=-1) return dp[ind];
        int l = f(ind-1, dp);
        int r = 0;
        if(ind>1)
        r = f(ind-2, dp);
        return dp[ind] = l+r;
    }
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return f(n, dp);
    }
}