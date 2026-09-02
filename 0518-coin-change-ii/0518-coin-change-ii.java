class Solution {
    int f(int ind, int t, int dp[][], int a[])
    {
        if(ind==0)
        {
            if(t==0 && a[0]==0) return 2;
            if(t==0 || t%a[ind]==0) return 1;
            return 0;
        }
        if(dp[ind][t]!=-1) return dp[ind][t];
        int p = 0;
        if(a[ind]<=t)
        p = f(ind, t-a[ind], dp, a);
        int np = f(ind-1, t, dp, a);
        return dp[ind][t] = p+np;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        if(coins[0]==0)
        dp[0][0] = 2;
        else
        {
            dp[0][0] = 1;
            for(int i=0 ; i<amount+1 ; i++)
            {
                if(i%coins[0]==0) dp[0][i] = 1;
            }
        }
        for(int i=1 ; i<n ; i++)
        {
            for(int t=0 ; t<amount+1 ; t++)
            {
                int p = 0;
                if(coins[i]<=t)
                p = dp[i][t-coins[i]];
                int np = dp[i-1][t];
                dp[i][t] = p+np;
            }
        }
        return dp[n-1][amount];
    }
}