class Solution {
    int f(int ind1, int ind2, String s1, String s2, int dp[][])
    {
        if(ind1<0 || ind2<0) return 0;
        if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];
        if(s1.charAt(ind1)==s2.charAt(ind2))
        {
            return dp[ind1][ind2] = 1+f(ind1-1, ind2-1, s1, s2, dp);
        }
        return dp[ind1][ind2] = Math.max(f(ind1-1, ind2, s1, s2, dp), f(ind1, ind2-1, s1, s2, dp));
    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        String s2 = sb.toString();
        int n = s.length();
        int dp[][] = new int[n+1][n+1];
        for(int i=0 ; i<=n ; i++) dp[0][i]=0;
        for(int i=0 ; i<=n ; i++) dp[i][0]=0;
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=n ; j++)
            {
                if(s.charAt(i-1)==s2.charAt(j-1))
                dp[i][j] = 1+dp[i-1][j-1];
                else
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][n];
    }
}