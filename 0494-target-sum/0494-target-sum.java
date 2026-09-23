class Solution {
    int f(int a[], int target)
    {
        int n = a.length;
        int dp[][] = new int[n][target+1];
        if(a[0]==0)
        {
            dp[0][0] = 2;
        }
        else
        {
            dp[0][0] = 1;
            if(a[0]<=target)
            dp[0][a[0]] = 1;
        }

        for(int ind=1 ; ind<n ; ind++)
        {
            for(int t=0 ; t<=target ; t++)
            {
                int p = 0;
                if(a[ind]<=t)
                p = dp[ind-1][t-a[ind]];
                int np = dp[ind-1][t];
                dp[ind][t] = p+np;
            }
        }
        return dp[n-1][target];
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int e:nums) sum += e;
        if((sum-target)%2==1 || sum-target<0) return 0;
        return f(nums, (sum-target)/2);
    }
}