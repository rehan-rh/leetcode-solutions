class Solution {
    int f(int ind, int amt, int dp[][], int a[])
    {
        if(ind==0)
        {
            if(a[0]==0) return 2;
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
        for(int a[]:dp) Arrays.fill(a, -1);
        return f(n-1, amount, dp, coins);
    }
}