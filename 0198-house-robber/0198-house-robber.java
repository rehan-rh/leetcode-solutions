class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        dp[0] = nums[0];
        for(int ind=1 ; ind<n ; ind++)
        {
            int p = nums[ind];
            if(ind>1)
            p = nums[ind] + dp[ind-2];
            int np = dp[ind-1];
            dp[ind] = Math.max(p, np);
        }
        return dp[n-1];
    }
}