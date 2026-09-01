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
        for(int i[]:dp)
        {
            Arrays.fill(i, Integer.MAX_VALUE);
        }
        return f(0, 0, n, triangle, dp);
    }
}