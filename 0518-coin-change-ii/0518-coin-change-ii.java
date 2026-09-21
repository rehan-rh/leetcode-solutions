class Solution {
    int f(int ind, int amt, int dp[][], int a[])
    {
        if(ind==0)
        {
            if(amt==0 && a[0]==0) return 2;
            if(amt==0 || amt%a[0]==0) return 1;
            return 0;
        }
        if(dp[ind][amt]!=-1) return dp[ind][amt];
        int p = 0;
        if(a[ind]<=amt)
        p = f(ind, amt-a[ind], dp, a);
        int np = f(ind-1, amt, dp, a);
        return dp[ind][amt] = p+np;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        for(int i=0 ; i<=amount ; i++)
        {
            if(amount==0 && coins[0]==0)
            dp[0][0] = 2;
            else if(i%coins[0]==0)
            {
                dp[0][i] = 1;
            }
            else
            {
                dp[0][i] = 0;
            }
        }
        for(int ind = 1 ; ind<n ; ind++)
        {
            for(int a=0 ; a<=amount ; a++)
            {
                int p = 0;
                if(coins[ind]<=a)
                p = dp[ind][a-coins[ind]];
                int np = dp[ind-1][a];
                dp[ind][a] = p+np;
            }
        }
        return dp[n-1][amount];
    }
}