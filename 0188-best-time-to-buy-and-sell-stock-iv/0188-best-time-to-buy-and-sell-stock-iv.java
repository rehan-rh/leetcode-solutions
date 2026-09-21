class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int dp[][][] = new int[n+1][2][k+1];
        for(int i=0 ; i<=n ; i++)
        {
            for(int b=0 ; b<2 ; b++)
            {
                dp[i][b][0] = 0;
            }
        }
        for(int b=0 ; b<2 ; b++)
        {
            for(int c=0 ; c<=k ; c++) dp[n][b][c] = 0;
        }

        for(int ind=n-1 ; ind>=0 ; ind--)
        {
            for(int b=0 ; b<2 ; b++)
            {
                for(int c=1 ; c<=k ; c++)
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
        return dp[0][1][k];
    }
}