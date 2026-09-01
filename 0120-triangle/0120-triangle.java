class Solution {
    static int f(int i, int j, int n, List<List<Integer>> triangle, int dp[][])
    {
        if(i==(n-1)) return triangle.get(i).get(j);
        if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
        int down = triangle.get(i).get(j)+f(i+1, j, n, triangle, dp);
        int diagonal = triangle.get(i).get(j)+f(i+1, j+1, n, triangle, dp);
        return dp[i][j]=Math.min(down, diagonal);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
       
        int n = triangle.size();
        int dp[][] = new int[n][n];
        for(int i=0 ; i<triangle.get(n-1).size() ; i++)
        {
            dp[n-1][i] = triangle.get(n-1).get(i);
        }
        for(int i=n-2 ; i>=0 ; i--)
        {
            for(int j=i ; j>=0 ; j--)
            {
                int down = dp[i+1][j];
                int dia = dp[i+1][j+1];
                dp[i][j] = triangle.get(i).get(j)+Math.min(down, dia);
            }
        }
        return dp[0][0];
    }
}