class Solution {
    int f(int ind, int t, int dp[][], int nums[])
    {
        if(t==0) return 1;
        if(dp[ind][t]!=-1) return dp[ind][t];
        if(ind==0) return nums[0]==t?1:0;
        int p = 0;
        if(nums[ind]<=t)
        p = f(ind-1, t-nums[ind], dp, nums);
        int np = f(ind-1, t, dp, nums);
        return dp[ind][t]=Math.max(p, np);
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int e:nums) sum+=e;
        if(sum%2==1) return false;
        int dp[][] = new int[n][sum/2+1];
        for(int i=0 ; i<n ; i++)
        {
            dp[i][0] = 1;
        }
        if(nums[0]<=sum/2)
        dp[0][nums[0]] = 1;
        for(int i=1 ; i<n ; i++)
        {
            for(int t=1 ; t<sum/2+1 ; t++)
            {
                int p = 0;
                if(nums[i]<=t)
                p = dp[i-1][t-nums[i]];
                int np = dp[i-1][t];
                dp[i][t] = Math.max(p, np);
            }
        }
        return dp[n-1][sum/2]==1;
    }
}