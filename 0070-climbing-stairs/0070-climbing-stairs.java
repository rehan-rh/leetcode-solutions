class Solution {
    int f(int ind, int []dp)
    {
        if(ind<=2) return ind;
        if(dp[ind]!=-1) return dp[ind];
        return dp[ind] = f(ind-1, dp)+f(ind-2, dp);
    }
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return f(n, dp);
    }
}