class Solution {
    int f(int i, int j, String s, String p, int dp[][])
    {
        if(i==0 && j==0) return 1;
        if(j==0 && i>=0) return 0;
        if(i==0 && j>=0){
            for(int k=1 ; k<=j ; k++)
            {
                if(p.charAt(k-1)!='*') return 0;
            }
            return 1;
        } 

        if(dp[i][j]!=-1) return dp[i][j];

        if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?')
        {
            return dp[i][j] = f(i-1, j-1, s, p, dp);
        }
        if(p.charAt(j-1)=='*')
        {
            return dp[i][j] = Math.max(f(i, j-1, s, p, dp), f(i-1 , j, s, p, dp));
        }
        return dp[i][j] = 0;

    }
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        int dp[][] = new int[n+1][m+1];
        for(int a[]:dp) Arrays.fill(a, -1);
        return f(n, m, s, p, dp)==1;
    }
}