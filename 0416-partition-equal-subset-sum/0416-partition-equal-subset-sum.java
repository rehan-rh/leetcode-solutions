class Solution {
    boolean f(int a[], int target)
    {
        int n = a.length;
        int dp[][] = new int[n][target+1];
        for(int i=0 ; i<n ; i++)
        {
            dp[i][0] = 1;
        }
        if(a[0]<=target)
        dp[0][a[0]] = 1;
        for(int i=1 ; i<n ; i++)
        {
            for(int t=1 ; t<=target ; t++)
            {
                int p = 0;
                if(a[i]<=t)
                p = dp[i-1][t-a[i]];
                int np = dp[i-1][t];
                dp[i][t] = Math.max(p, np);
            }
        }
        return dp[n-1][target]==1;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int e:nums) sum += e;
        if(sum%2==1) return false;
        int target = sum/2;
        return f(nums, target);
    }
}