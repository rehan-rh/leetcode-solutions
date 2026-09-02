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
        for(int a[]:dp) Arrays.fill(a, -1);
        return f(n-1, t, dp, nums);
    }
    public int findTargetSumWays(int[] nums, int target) {
        return df(nums, target);
    }
}