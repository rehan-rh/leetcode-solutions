class Solution {
    int f(int ind, int buy, int dp[][], int a[])
    {
        if(ind==a.length) return 0;
        if(dp[ind][buy]!=-1) return dp[ind][buy];
        int p = 0;
        if(buy==1)
        p = Math.max(-a[ind] + f(ind+1, 0, dp, a), f(ind+1, 1, dp, a));
        else
        p = Math.max(a[ind]+f(ind+1, 1, dp, a), f(ind+1, 0, dp, a));
        return dp[ind][buy] = p;
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n+1][2];
        dp[n-1][0] = 0;
        dp[n-1][1] = 0;
        for(int ind=n-1 ; ind>=0 ; ind--)
        {
            for(int buy=0 ; buy<=1 ; buy++)
            {
                int p = 0;
                if(buy==1)
                    p = Math.max(-prices[ind] + dp[ind+1][0], dp[ind+1][1]);
                else
                    p = Math.max(prices[ind] + dp[ind+1][1], dp[ind+1][0]);
                dp[ind][buy] = p;
            }
        } 
        return dp[0][1];
    }
}