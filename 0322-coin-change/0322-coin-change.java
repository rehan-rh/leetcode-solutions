class Solution {
    int f(int ind, int amt, int dp[][], int a[])
    {
        if(ind==0){
            if(amt%a[0]==0) return amt/a[0];
            return (int)1e9;
        }
        if(dp[ind][amt]!=-1) return dp[ind][amt];
        int p = (int)1e9;
        if(a[ind]<=amt)
        p = 1 + f(ind, amt-a[ind], dp, a);
        int np = f(ind-1, amt, dp, a);
        return dp[ind][amt] = Math.min(p, np);

    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        for(int i=0 ; i<=amount ; i++) 
        {
            if(i%coins[0]==0) dp[0][i] = i/coins[0];
            else dp[0][i] = (int)1e9;
        }

        for(int ind=1 ; ind<n ; ind++)
        {
            for(int a=0 ; a<=amount ; a++)
            {
                int p = (int)1e9;
                if(coins[ind]<=a)
                p = 1 + dp[ind][a-coins[ind]];
                int np = dp[ind-1][a];
                dp[ind][a] = Math.min(p, np);
            }
        }
        return dp[n-1][amount]==(int)1e9?-1:dp[n-1][amount];
    }
}