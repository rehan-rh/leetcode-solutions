class Solution {
    int f(int ind, int t, int dp[][], int nums[])
    {
        if(t==0) return 1;
        if(t<0) return 0;
        if(dp[ind][t]!=-1) return dp[ind][t];
        if(ind==0) return nums[0]==t?1:0;
        int p = f(ind-1, t-nums[ind], dp, nums);
        int np = f(ind-1, t, dp, nums);
        return dp[ind][t]=Math.max(p, np);
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int e:nums) sum+=e;
        if(sum%2==1) return false;
        int dp[][] = new int[n][sum/2+1];
        for(int a[]:dp)
        Arrays.fill(a, -1);
        return f(n-1, sum/2, dp, nums)==1;
    }
}