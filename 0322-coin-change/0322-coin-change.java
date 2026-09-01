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
        for(int a[]:dp) Arrays.fill(a, -1);
        int res = f(n-1, amount, dp, coins);
        return res==(int)1e9?-1:res;
    }
}