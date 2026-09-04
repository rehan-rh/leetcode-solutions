class Solution {
    int f(int ind, int dp[], int a[])
    {
        if(ind==0) return a[0];
        if(dp[ind]!=-1) return dp[ind];
        int p = a[ind];
        if(ind>1)
        p = a[ind] + f(ind-2, dp, a);
        int np = 0 + f(ind-1, dp, a);
        return dp[ind] = Math.max(p, np);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        return f(n-1, dp, nums);
    }
}