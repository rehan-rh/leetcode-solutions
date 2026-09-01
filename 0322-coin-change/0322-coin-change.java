class Solution {
    int f(int ind, int amt, int dp[][], int a[])
    {
        if(ind==0) 
        {
            if(amt%a[ind]==0) return amt/a[ind];
            return (int)1e9;
        }
        if(dp[ind][amt]!=-1) return dp[ind][amt];
        int p = (int)1e9;
        if(a[ind]<=amt)
        p = 1+f(ind, amt-a[ind], dp, a);
        int np = 0+f(ind-1, amt, dp, a);
        return dp[ind][amt] = Math.min(p, np);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        for(int i=0 ; i<amount+1 ; i++)
        {
            if(i%coins[0]==0)
            dp[0][i] = i/coins[0];
            else
            dp[0][i] = (int)1e9;
        }
        for(int i=1 ; i<n ; i++)
        {
            for(int t=0 ; t<amount+1 ; t++)
            {
                int p = (int)1e9;
                if(coins[i]<=t)
                p = 1+dp[i][t-coins[i]];
                int np = 0+dp[i-1][t];
                dp[i][t] = Math.min(p, np);
            }
        }
        return dp[n-1][amount]==(int)1e9?-1:dp[n-1][amount];
    }
}