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
        dp[0] = nums[0];
        for(int ind=1 ; ind<n ; ind++)
        {
            int p = nums[ind];
            if(ind>1)
            p = nums[ind] + dp[ind-2];
            int np = 0 + dp[ind-1];
            dp[ind] = Math.max(p, np);
        }
        return dp[n-1];
    }
}