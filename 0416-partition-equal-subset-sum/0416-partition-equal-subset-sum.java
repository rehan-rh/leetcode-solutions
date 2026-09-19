class Solution {
    boolean f(int[] arr, int target) 
    {
        int n = arr.length;
        int dp[][] = new int[n][target+1];
        for(int i=0 ; i<n ; i++)
        {
            dp[i][0] = 1;
        }
        if(arr[0]<=target)
        dp[0][arr[0]] = 1;
        for(int ind=1 ; ind<n ; ind++)
        {
            for(int t=1 ; t<target+1 ; t++)
            {
                int p = 0;
                if(arr[ind]<=t)
                p = dp[ind-1][t-arr[ind]];
                int np = dp[ind-1][t];
                dp[ind][t] = Math.max(p, np);
            }
        }
        return dp[n-1][target]==1;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int e:nums) sum+=e;
        if(sum%2==1) return false;
        return f(nums, sum/2);
    }
}