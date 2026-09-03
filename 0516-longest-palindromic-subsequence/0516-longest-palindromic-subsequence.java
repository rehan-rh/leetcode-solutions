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
        int dp[][] = new int[n][n];
        for(int a[]:dp) Arrays.fill(a, -1);
        return f(n-1, n-1, s, s2, dp);
    }
}