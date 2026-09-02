class Solution {
    int f(int ind, int t, int dp[][], int a[])
    {
        if(ind==0)
        {
            if(t==0 || t%a[0]==0) return 1;
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
        for(int a[]:dp) Arrays.fill(a, -1);
        return f(n-1, amount, dp, coins);
    }
}