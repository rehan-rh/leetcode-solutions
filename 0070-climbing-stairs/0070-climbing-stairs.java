class Solution {
    int f(int ind, int []dp)
    {
        if(ind<=2) return ind;
        if(dp[ind]!=-1) return dp[ind];
        return dp[ind] = f(ind-1, dp)+f(ind-2, dp);
    }
    public int climbStairs(int n) {
        if(n<=2) return n;
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3 ; i<=n ; i++)
        {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}