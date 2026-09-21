class Solution {
    int f(int ind, int buy, int dp[][], int a[])
    {
        if(ind==a.length) return 0;
        if(dp[ind][buy]!=-1) return dp[ind][buy];
        if(buy==1)
        return dp[ind][buy] = Math.max(-a[ind] + f(ind+1, 0, dp, a), f(ind+1, 1, dp, a));
        else
        return dp[ind][buy] = Math.max(a[ind]+f(ind+1, 1, dp, a), f(ind+1, 0, dp, a));
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n][2];
        for(int a[]:dp) Arrays.fill(a, -1);
        return f(0, 1, dp, prices);
    }
}