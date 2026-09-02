class Solution {
    int f(int ind, int t, int dp[][], int a[])
    {
        if(ind==0){
            if(t==0 && a[0]==0) return 2;
            if(t==0 || a[0]==t) return 1;
            return 0;
        }
        if(dp[ind][t]!=-1) return dp[ind][t];
        int p = 0;
        if(a[ind]<=t)
        p = f(ind-1, t-a[ind], dp, a);
        int np = f(ind-1, t, dp, a);
        return dp[ind][t] = p+np;
    }
    int df(int nums[], int dif)
    {
        int ts = 0;
        for(int e:nums) ts += e;
        int t = (ts-dif)/2;
        if((ts-dif)<0 || (ts-dif)%2==1) return 0;
        int n = nums.length;
        int dp[][] = new int[n][t+1];
        if(nums[0]==0)
        dp[0][0] = 2;
        else
        {
            dp[0][0] = 1;
            if(nums[0]<=t)
            dp[0][nums[0]] = 1;
        }
        for(int i=1 ; i<n ; i++)
        {
            for(int j=0 ; j<t+1 ; j++)
            {
                int p = 0;
                if(nums[i]<=j)
                p = dp[i-1][j-nums[i]];
                int np = dp[i-1][j];
                dp[i][j] = p+np;
            }
        }
        return dp[n-1][t];

    }
    public int findTargetSumWays(int[] nums, int target) {
        return df(nums, target);
    }
}