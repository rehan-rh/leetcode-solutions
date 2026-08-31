class Solution {
    int f(int nums[])
    {
        int n = nums.length;
        int dp[] = new int[n];
        if(n==0) return 0;
        dp[0] = nums[0];
        for(int i=1 ; i<n ; i++)
        {
            int p = nums[i];
            if(i>1) 
            p += dp[i-2];
            int np = 0 + dp[i-1];
            dp[i] = Math.max(p, np);
        } 
        return dp[n-1];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int temp1[] = new int[n];
        int temp2[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            if(i!=0) temp1[i] = nums[i];
            if(i!=n-1) temp2[i] = nums[i];
        }

        return Math.max(f(temp1), f(temp2));
    }
}