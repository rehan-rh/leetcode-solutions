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
        if(n<=2) return n;
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int ind=3 ; ind<=n ;ind++)
        {
            int l = dp[ind-1];
            int r = 0;
            if(ind>1)
            r = dp[ind-2];
            dp[ind] = l+r;
        }
        return dp[n];
    }
}