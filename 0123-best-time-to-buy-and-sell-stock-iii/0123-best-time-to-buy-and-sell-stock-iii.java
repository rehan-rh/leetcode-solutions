class Solution {
    int f(int ind, int buy, int cap, int dp[][][], int a[])
    {
        if(cap==0) return 0;
        if(ind==a.length) return 0;
        int p = 0;
        if(buy==1)
        {
            p = Math.max(-a[ind]+f(ind+1, 0, cap, dp, a), f(ind+1, 1, cap, dp, a));
        }
        else
        {
            p = Math.max(a[ind]+f(ind+1, 1, cap-1, dp, a), f(ind+1, 0, cap, dp, a));
        }
        return dp[ind][buy][cap] = p;
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][][] = new int[n+1][2][3];
        for(int i=0 ; i<=n ; i++)
        {
            for(int b=0 ; b<2 ; b++)
            {
                dp[i][b][0] = 0;
            }
        }
        for(int b=0 ; b<2 ; b++)
        {
            for(int c=0 ; c<3 ; c++) dp[n][b][c] = 0;
        }

        for(int ind=n-1 ; ind>=0 ; ind--)
        {
            for(int b=0 ; b<2 ; b++)
            {
                for(int c=1 ; c<3 ; c++)
                {
                    int p=0;
                    if(b==1)
                    {
                        p = Math.max(-prices[ind]+dp[ind+1][0][c], dp[ind+1][1][c]);
                    }
                    else
                    {
                        p = Math.max(prices[ind]+dp[ind+1][1][c-1], dp[ind+1][0][c]);
                    }
                    dp[ind][b][c] = p;
                }
            }
        }
        return dp[0][1][2];
    }
}